**blockingqueue**&**lock-free queue** test in spsc(single-producer-single-consumer),mpsc,spmc,mpmc.

<h3>1.blockingqueue test</h3>

- [ArrayBlockingQueueTwoLocks](https://github.com/zysaaa/queue-test/blob/master/src/main/java/blockingqueue/ArrayBlockingQueueTwoLocks.java)
- ArrayBlockingQueue from JUC
- LinkedBlockingQueue from JUC

Test scenario: SPSC. Start.

======================================================================================

Testcase: capacity is 500, producerCount is 1, consumerCount is 1

Throughput: 1027 ns/item -->java.util.concurrent.ArrayBlockingQueue

Throughput: 1336 ns/item -->java.util.concurrent.LinkedBlockingQueue

Throughput: 1209 ns/item -->com.zysaaa.queueyaqueue.perftest.blockingqueue.ArrayBlockingQueueTwoLocks

======================================================================================

Testcase: capacity is 5000, producerCount is 1, consumerCount is 1

Throughput: 940 ns/item -->java.util.concurrent.ArrayBlockingQueue

Throughput: 614 ns/item -->java.util.concurrent.LinkedBlockingQueue

Throughput: 599 ns/item -->com.zysaaa.queueyaqueue.perftest.blockingqueue.ArrayBlockingQueueTwoLocks

======================================================================================

Testcase: capacity is 50000, producerCount is 1, consumerCount is 1

Throughput: 588 ns/item -->java.util.concurrent.ArrayBlockingQueue

Throughput: 313 ns/item -->java.util.concurrent.LinkedBlockingQueue

Throughput: 889 ns/item -->com.zysaaa.queueyaqueue.perftest.blockingqueue.ArrayBlockingQueueTwoLocks

======================================================================================

Testcase: capacity is 500000, producerCount is 1, consumerCount is 1

Throughput: 551 ns/item -->java.util.concurrent.ArrayBlockingQueue

Throughput: 506 ns/item -->java.util.concurrent.LinkedBlockingQueue

Throughput: 544 ns/item -->com.zysaaa.queueyaqueue.perftest.blockingqueue.ArrayBlockingQueueTwoLocks

======================================================================================

Test scenario: SPSC. End.

======================================================================================

Test scenario: SPMC. Start.

======================================================================================

Testcase: capacity is 500, producerCount is 1, consumerCount is 2

Throughput: 2597 ns/item -->java.util.concurrent.ArrayBlockingQueue

Throughput: 1085 ns/item -->java.util.concurrent.LinkedBlockingQueue

Throughput: 736 ns/item -->com.zysaaa.queueyaqueue.perftest.blockingqueue.ArrayBlockingQueueTwoLocks

======================================================================================

Testcase: capacity is 500, producerCount is 1, consumerCount is 16

Throughput: 41018 ns/item -->java.util.concurrent.ArrayBlockingQueue

Throughput: 4471 ns/item -->java.util.concurrent.LinkedBlockingQueue

Throughput: 7681 ns/item -->com.zysaaa.queueyaqueue.perftest.blockingqueue.ArrayBlockingQueueTwoLocks

======================================================================================

Testcase: capacity is 500, producerCount is 1, consumerCount is 64

Throughput: 320328 ns/item -->java.util.concurrent.ArrayBlockingQueue

Throughput: 19010 ns/item -->java.util.concurrent.LinkedBlockingQueue

Throughput: 21515 ns/item -->com.zysaaa.queueyaqueue.perftest.blockingqueue.ArrayBlockingQueueTwoLocks

======================================================================================

Testcase: capacity is 5000, producerCount is 1, consumerCount is 2

Throughput: 886 ns/item -->java.util.concurrent.ArrayBlockingQueue

Throughput: 674 ns/item -->java.util.concurrent.LinkedBlockingQueue

Throughput: 726 ns/item -->com.zysaaa.queueyaqueue.perftest.blockingqueue.ArrayBlockingQueueTwoLocks

======================================================================================

Testcase: capacity is 5000, producerCount is 1, consumerCount is 16

Throughput: 21918 ns/item -->java.util.concurrent.ArrayBlockingQueue

Throughput: 4388 ns/item -->java.util.concurrent.LinkedBlockingQueue

Throughput: 4136 ns/item -->com.zysaaa.queueyaqueue.perftest.blockingqueue.ArrayBlockingQueueTwoLocks

======================================================================================

Testcase: capacity is 5000, producerCount is 1, consumerCount is 64

Throughput: 104489 ns/item -->java.util.concurrent.ArrayBlockingQueue

Throughput: 25841 ns/item -->java.util.concurrent.LinkedBlockingQueue

Throughput: 59339 ns/item -->com.zysaaa.queueyaqueue.perftest.blockingqueue.ArrayBlockingQueueTwoLocks

======================================================================================

Testcase: capacity is 50000, producerCount is 1, consumerCount is 2

Throughput: 765 ns/item -->java.util.concurrent.ArrayBlockingQueue

Throughput: 646 ns/item -->java.util.concurrent.LinkedBlockingQueue

Throughput: 641 ns/item -->com.zysaaa.queueyaqueue.perftest.blockingqueue.ArrayBlockingQueueTwoLocks

======================================================================================

Testcase: capacity is 50000, producerCount is 1, consumerCount is 16

Throughput: 21954 ns/item -->java.util.concurrent.ArrayBlockingQueue

Throughput: 4142 ns/item -->java.util.concurrent.LinkedBlockingQueue

Throughput: 3866 ns/item -->com.zysaaa.queueyaqueue.perftest.blockingqueue.ArrayBlockingQueueTwoLocks

======================================================================================

Testcase: capacity is 50000, producerCount is 1, consumerCount is 64

Throughput: 101167 ns/item -->java.util.concurrent.ArrayBlockingQueue

Throughput: 50219 ns/item -->java.util.concurrent.LinkedBlockingQueue

Throughput: 50574 ns/item -->com.zysaaa.queueyaqueue.perftest.blockingqueue.ArrayBlockingQueueTwoLocks

======================================================================================

Testcase: capacity is 500000, producerCount is 1, consumerCount is 2

Throughput: 1049 ns/item -->java.util.concurrent.ArrayBlockingQueue

Throughput: 603 ns/item -->java.util.concurrent.LinkedBlockingQueue

Throughput: 536 ns/item -->com.zysaaa.queueyaqueue.perftest.blockingqueue.ArrayBlockingQueueTwoLocks

======================================================================================

Testcase: capacity is 500000, producerCount is 1, consumerCount is 16

Throughput: 26772 ns/item -->java.util.concurrent.ArrayBlockingQueue

Throughput: 4129 ns/item -->java.util.concurrent.LinkedBlockingQueue

Throughput: 3954 ns/item -->com.zysaaa.queueyaqueue.perftest.blockingqueue.ArrayBlockingQueueTwoLocks

======================================================================================

Testcase: capacity is 500000, producerCount is 1, consumerCount is 64

Throughput: 168568 ns/item -->java.util.concurrent.ArrayBlockingQueue

Throughput: 41224 ns/item -->java.util.concurrent.LinkedBlockingQueue

Throughput: 70990 ns/item -->com.zysaaa.queueyaqueue.perftest.blockingqueue.ArrayBlockingQueueTwoLocks

======================================================================================

Test scenario: SPMC. End.

======================================================================================

Test scenario: MPSC. Start.

======================================================================================

Testcase: capacity is 500, producerCount is 2, consumerCount is 1

Throughput: 927 ns/item -->java.util.concurrent.ArrayBlockingQueue

Throughput: 537 ns/item -->java.util.concurrent.LinkedBlockingQueue

Throughput: 571 ns/item -->com.zysaaa.queueyaqueue.perftest.blockingqueue.ArrayBlockingQueueTwoLocks

======================================================================================

Testcase: capacity is 500, producerCount is 16, consumerCount is 1

Throughput: 660 ns/item -->java.util.concurrent.ArrayBlockingQueue

Throughput: 376 ns/item -->java.util.concurrent.LinkedBlockingQueue

Throughput: 586 ns/item -->com.zysaaa.queueyaqueue.perftest.blockingqueue.ArrayBlockingQueueTwoLocks

======================================================================================

Testcase: capacity is 500, producerCount is 64, consumerCount is 1

Throughput: 3099 ns/item -->java.util.concurrent.ArrayBlockingQueue

Throughput: 403 ns/item -->java.util.concurrent.LinkedBlockingQueue

Throughput: 385 ns/item -->com.zysaaa.queueyaqueue.perftest.blockingqueue.ArrayBlockingQueueTwoLocks

======================================================================================

Testcase: capacity is 5000, producerCount is 2, consumerCount is 1

Throughput: 291 ns/item -->java.util.concurrent.ArrayBlockingQueue

Throughput: 289 ns/item -->java.util.concurrent.LinkedBlockingQueue

Throughput: 301 ns/item -->com.zysaaa.queueyaqueue.perftest.blockingqueue.ArrayBlockingQueueTwoLocks

======================================================================================

Testcase: capacity is 5000, producerCount is 16, consumerCount is 1

Throughput: 487 ns/item -->java.util.concurrent.ArrayBlockingQueue

Throughput: 382 ns/item -->java.util.concurrent.LinkedBlockingQueue

Throughput: 369 ns/item -->com.zysaaa.queueyaqueue.perftest.blockingqueue.ArrayBlockingQueueTwoLocks

======================================================================================

Testcase: capacity is 5000, producerCount is 64, consumerCount is 1

Throughput: 1285 ns/item -->java.util.concurrent.ArrayBlockingQueue

Throughput: 370 ns/item -->java.util.concurrent.LinkedBlockingQueue

Throughput: 352 ns/item -->com.zysaaa.queueyaqueue.perftest.blockingqueue.ArrayBlockingQueueTwoLocks

======================================================================================

Testcase: capacity is 50000, producerCount is 2, consumerCount is 1

Throughput: 320 ns/item -->java.util.concurrent.ArrayBlockingQueue

Throughput: 280 ns/item -->java.util.concurrent.LinkedBlockingQueue

Throughput: 277 ns/item -->com.zysaaa.queueyaqueue.perftest.blockingqueue.ArrayBlockingQueueTwoLocks

======================================================================================

Testcase: capacity is 50000, producerCount is 16, consumerCount is 1

Throughput: 425 ns/item -->java.util.concurrent.ArrayBlockingQueue

Throughput: 306 ns/item -->java.util.concurrent.LinkedBlockingQueue

Throughput: 335 ns/item -->com.zysaaa.queueyaqueue.perftest.blockingqueue.ArrayBlockingQueueTwoLocks

======================================================================================

Testcase: capacity is 50000, producerCount is 64, consumerCount is 1

Throughput: 893 ns/item -->java.util.concurrent.ArrayBlockingQueue

Throughput: 334 ns/item -->java.util.concurrent.LinkedBlockingQueue

Throughput: 266 ns/item -->com.zysaaa.queueyaqueue.perftest.blockingqueue.ArrayBlockingQueueTwoLocks

======================================================================================

Testcase: capacity is 500000, producerCount is 2, consumerCount is 1

Throughput: 234 ns/item -->java.util.concurrent.ArrayBlockingQueue

Throughput: 353 ns/item -->java.util.concurrent.LinkedBlockingQueue

Throughput: 324 ns/item -->com.zysaaa.queueyaqueue.perftest.blockingqueue.ArrayBlockingQueueTwoLocks

======================================================================================

Testcase: capacity is 500000, producerCount is 16, consumerCount is 1

Throughput: 271 ns/item -->java.util.concurrent.ArrayBlockingQueue

Throughput: 374 ns/item -->java.util.concurrent.LinkedBlockingQueue

Throughput: 300 ns/item -->com.zysaaa.queueyaqueue.perftest.blockingqueue.ArrayBlockingQueueTwoLocks

======================================================================================

Testcase: capacity is 500000, producerCount is 64, consumerCount is 1

Throughput: 253 ns/item -->java.util.concurrent.ArrayBlockingQueue

Throughput: 358 ns/item -->java.util.concurrent.LinkedBlockingQueue

Throughput: 304 ns/item -->com.zysaaa.queueyaqueue.perftest.blockingqueue.ArrayBlockingQueueTwoLocks

======================================================================================

Test scenario: MPSC. End.

======================================================================================

Test scenario: MPMC. Start.

======================================================================================

Testcase: capacity is 500, producerCount is 2, consumerCount is 2

Throughput: 826 ns/item -->java.util.concurrent.ArrayBlockingQueue

Throughput: 732 ns/item -->java.util.concurrent.LinkedBlockingQueue

Throughput: 657 ns/item -->com.zysaaa.queueyaqueue.perftest.blockingqueue.ArrayBlockingQueueTwoLocks

======================================================================================

Testcase: capacity is 500, producerCount is 16, consumerCount is 16

Throughput: 10380 ns/item -->java.util.concurrent.ArrayBlockingQueue

Throughput: 5697 ns/item -->java.util.concurrent.LinkedBlockingQueue

Throughput: 5267 ns/item -->com.zysaaa.queueyaqueue.perftest.blockingqueue.ArrayBlockingQueueTwoLocks

======================================================================================

Testcase: capacity is 500, producerCount is 64, consumerCount is 64

Throughput: 65362 ns/item -->java.util.concurrent.ArrayBlockingQueue

Throughput: 26583 ns/item -->java.util.concurrent.LinkedBlockingQueue

Throughput: 22673 ns/item -->com.zysaaa.queueyaqueue.perftest.blockingqueue.ArrayBlockingQueueTwoLocks

======================================================================================

Testcase: capacity is 5000, producerCount is 2, consumerCount is 2

Throughput: 780 ns/item -->java.util.concurrent.ArrayBlockingQueue

Throughput: 708 ns/item -->java.util.concurrent.LinkedBlockingQueue

Throughput: 555 ns/item -->com.zysaaa.queueyaqueue.perftest.blockingqueue.ArrayBlockingQueueTwoLocks

======================================================================================

Testcase: capacity is 5000, producerCount is 16, consumerCount is 16

Throughput: 4854 ns/item -->java.util.concurrent.ArrayBlockingQueue

Throughput: 5276 ns/item -->java.util.concurrent.LinkedBlockingQueue

Throughput: 4521 ns/item -->com.zysaaa.queueyaqueue.perftest.blockingqueue.ArrayBlockingQueueTwoLocks

======================================================================================

Testcase: capacity is 5000, producerCount is 64, consumerCount is 64

Throughput: 25912 ns/item -->java.util.concurrent.ArrayBlockingQueue

Throughput: 23227 ns/item -->java.util.concurrent.LinkedBlockingQueue

Throughput: 22708 ns/item -->com.zysaaa.queueyaqueue.perftest.blockingqueue.ArrayBlockingQueueTwoLocks

======================================================================================

Testcase: capacity is 50000, producerCount is 2, consumerCount is 2

Throughput: 861 ns/item -->java.util.concurrent.ArrayBlockingQueue

Throughput: 655 ns/item -->java.util.concurrent.LinkedBlockingQueue

Throughput: 595 ns/item -->com.zysaaa.queueyaqueue.perftest.blockingqueue.ArrayBlockingQueueTwoLocks

======================================================================================

Testcase: capacity is 50000, producerCount is 16, consumerCount is 16

Throughput: 3211 ns/item -->java.util.concurrent.ArrayBlockingQueue

Throughput: 4944 ns/item -->java.util.concurrent.LinkedBlockingQueue

Throughput: 5096 ns/item -->com.zysaaa.queueyaqueue.perftest.blockingqueue.ArrayBlockingQueueTwoLocks

======================================================================================

Testcase: capacity is 50000, producerCount is 64, consumerCount is 64

Throughput: 24695 ns/item -->java.util.concurrent.ArrayBlockingQueue

Throughput: 24401 ns/item -->java.util.concurrent.LinkedBlockingQueue

Throughput: 22692 ns/item -->com.zysaaa.queueyaqueue.perftest.blockingqueue.ArrayBlockingQueueTwoLocks

======================================================================================

Testcase: capacity is 500000, producerCount is 2, consumerCount is 2

Throughput: 894 ns/item -->java.util.concurrent.ArrayBlockingQueue

Throughput: 773 ns/item -->java.util.concurrent.LinkedBlockingQueue

Throughput: 623 ns/item -->com.zysaaa.queueyaqueue.perftest.blockingqueue.ArrayBlockingQueueTwoLocks

======================================================================================

Testcase: capacity is 500000, producerCount is 16, consumerCount is 16

Throughput: 6107 ns/item -->java.util.concurrent.ArrayBlockingQueue

Throughput: 6096 ns/item -->java.util.concurrent.LinkedBlockingQueue

Throughput: 5924 ns/item -->com.zysaaa.queueyaqueue.perftest.blockingqueue.ArrayBlockingQueueTwoLocks

======================================================================================

Testcase: capacity is 500000, producerCount is 64, consumerCount is 64

Throughput: 23477 ns/item -->java.util.concurrent.ArrayBlockingQueue

Throughput: 24489 ns/item -->java.util.concurrent.LinkedBlockingQueue

Throughput: 23099 ns/item -->com.zysaaa.queueyaqueue.perftest.blockingqueue.ArrayBlockingQueueTwoLocks

======================================================================================

Test scenario: MPMC. End.

======================================================================================

<h3>2.lock-free queue test</h3>





