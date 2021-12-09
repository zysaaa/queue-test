package blockingqueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicLong;

public class Producer extends Executor  {

    Generator<Integer> generator;

    public Producer(BlockingQueue<Integer> blockingQueue, int count, CyclicBarrier cyclicBarrier, Generator<Integer> generator, AtomicLong atomicLong) {
        super(blockingQueue, count, cyclicBarrier, atomicLong);
        this.generator = generator;
    }

    public void doExecute(AtomicLong checker) {
        try {
            while (count -- > 0) {
                Integer generate = generator.generate();
                checker.addAndGet(generate);
                bq.put(generate);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
