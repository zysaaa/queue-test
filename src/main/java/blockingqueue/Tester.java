package blockingqueue;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicLong;

public class Tester {

    public ExecutorService pool = Executors.newCachedThreadPool();
    protected CyclicBarrier cyclicBarrier;
    protected final int count, producerCount, consumerCount;
    private final BlockingQueue<Integer>[] blockingQueues;

    @SafeVarargs
    public Tester(int producerCount, int consumerCount, int count, BlockingQueue<Integer>... blockingQueues) {
        this.count = count;
        this.producerCount = producerCount;
        this.consumerCount = consumerCount;
        this.blockingQueues = blockingQueues;
        this.cyclicBarrier = new CyclicBarrier(producerCount + consumerCount + 1);
    }

    public void start() {
        preHeat();
        for (BlockingQueue<Integer> blockingQueue : blockingQueues) {
            doTest(blockingQueue, true);
        }
    }

    private void preHeat() {
        int cnt = 5;
        while (cnt -- > 0) {
            doTest(blockingQueues[0], false);
        }
    }

    public void doTest(BlockingQueue<Integer> blockingQueue, boolean print) {
        try {
            AtomicLong checker = new AtomicLong();
            long t0 = System.nanoTime();
            for (int i = 0; i < consumerCount; i++) {
                pool.execute(new Consumer(blockingQueue, count * producerCount, cyclicBarrier, checker));
            }
            for (int i = 0; i < producerCount; i++) {
                pool.execute(new Producer(blockingQueue, count * consumerCount, cyclicBarrier, checker));
            }
            cyclicBarrier.await();
            cyclicBarrier.await();
            if (!blockingQueue.isEmpty() || checker.get() != 0) {
                System.err.println("what??  First ensure the correctness of your queue, and then test the performance: " + blockingQueue.getClass().getName());
                System.exit(-1);
            }
            if (print) {
                long nsPerItem = (System.nanoTime() - t0) / (producerCount * (long) count);
                System.out.println("Throughput: " + nsPerItem + " ns/item -->" + blockingQueue.getClass().getName() + "\r\n");
            }
         } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void stop() {
        pool.shutdownNow();
    }

    abstract static class Executor implements Runnable {

        protected final BlockingQueue<Integer> bq;
        protected long count;
        private final CyclicBarrier cyclicBarrier;
        private final AtomicLong checker;


        public Executor(BlockingQueue<Integer> blockingQueue, int count, CyclicBarrier cyclicBarrier, AtomicLong atomicLong) {
            bq = blockingQueue;
            this.count = count;
            this.cyclicBarrier = cyclicBarrier;
            this.checker = atomicLong;
        }

        public void run() {
            try {
                cyclicBarrier.await();
                doExecute(checker);
                cyclicBarrier.await();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

        abstract void doExecute(AtomicLong checker);

    }


    static class Producer extends Executor {

        Random r = new Random();

        public Producer(BlockingQueue<Integer> blockingQueue, int count, CyclicBarrier cyclicBarrier, AtomicLong atomicLong) {
            super(blockingQueue, count, cyclicBarrier, atomicLong);
        }

        public void doExecute(AtomicLong checker) {
            try {
                while (count -- > 0) {
                    int random = r.nextInt(10000);
                    checker.addAndGet(random);
                    bq.put(random);
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    static class Consumer extends Executor {

        public Consumer(BlockingQueue<Integer> blockingQueue, int count, CyclicBarrier cyclicBarrier, AtomicLong atomicLong) {
            super(blockingQueue, count, cyclicBarrier, atomicLong);
        }

        public void doExecute(AtomicLong checker) {
            try {
                while (count -- > 0) {
                    checker.addAndGet(-bq.take());
                }
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }


}
