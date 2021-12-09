package blockingqueue;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicLong;

public abstract class Executor implements Runnable {

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

    // Optional
    Random random = new Random();
    protected void mockSomeOperate() {
        int randomInt = random.nextInt(100);
        for (int i = 0; i < randomInt; i++) {
            String string = UUID.randomUUID().toString();
            if (string.hashCode() == System.nanoTime()) {
                System.out.println(" ");
            }
        }
    }
}
