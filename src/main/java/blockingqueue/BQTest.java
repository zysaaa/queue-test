package blockingqueue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Test: {@link ArrayBlockingQueueTwoLocks}
 *       {@link ArrayBlockingQueue}
 *       {@link LinkedBlockingQueue}
 */
public class BQTest {

    public void test() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Choose scenario(s), split by ','. (Type q to exit)");
                System.out.println("Options: " + Arrays.toString(Scenario.values()));
                String input = scanner.nextLine();
                if (input.equals("q")) {
                    break;
                }
                String[] split = input.split(",");
                for (String s : split) {
                    test(Scenario.valueOf(s.toUpperCase()));
                }
            } catch (Exception e) {
                System.err.println("Error." + e.getMessage());
            }
        }
    }

    static int count = 10000;

    private void test(Scenario scenario) {
        List<int[]> testCase = scenario.testCase();
        System.out.println("Test scenario: " + scenario.name() + ". Start.");
        printSeparator();
        for (int cap = 500; cap <= 500000; cap *= 10) {
            for (int[] arr : testCase) {
                int producerCount = arr[0];
                int consumerCount = arr[1];
                Tester tester = new Tester(
                        producerCount,
                        consumerCount,
                        count,
                        new ArrayBlockingQueue<>(cap),
                        new LinkedBlockingQueue<>(cap),
                        new ArrayBlockingQueueTwoLocks<>(cap));
                System.out.println("Testcase: capacity is " + cap + ", producerCount is " + producerCount + ", consumerCount is " + consumerCount + "\r\n");
                tester.start();
                tester.stop();
                printSeparator();
            }
        }
        System.out.println("Test scenario: " + scenario.name() + ". End.");
        printSeparator();
    }

    private static void printSeparator() {
        System.out.println("======================================================================================");
    }

    enum Scenario {

        SPSC {
            @Override
            public List<int[]> testCase() {
                int[] testCase = new int[] {1, 1};
                return Collections.singletonList(testCase);
            }
        },
        SPMC {
            @Override
            public List<int[]> testCase() {
                return Arrays.asList(
                    new int[] {1,     2},
                    new int[] {1,     2 * 2 * 2 * 2},
                    new int[] {1,     2 * 2 * 2 * 2 * 2 * 2}
                );
            }
        },
        MPSC {
            @Override
            public List<int[]> testCase() {
                return Arrays.asList(
                    new int[] {2,                                 1},
                    new int[] {2 * 2 * 2 * 2,                     1},
                    new int[] {2 * 2 * 2 * 2 * 2 * 2,             1}
                );
            }
        },
        MPMC {
            @Override
            public List<int[]> testCase() {
                return Arrays.asList(
                    new int[] {2,                               2},
                    new int[] {2 * 2 * 2 * 2,                   2 * 2 * 2 * 2},
                    new int[] {2 * 2 * 2 * 2 * 2 * 2,           2 * 2 * 2 * 2 * 2 * 2}
                );
            }
        };

        // int[0] is producer count, int[1] is consumer count
        public abstract List<int[]> testCase();
    }

}
