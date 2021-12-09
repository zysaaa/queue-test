package blockingqueue;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author jimmapzya@gmail.com(zysaaa)
 */
public enum Scenario {

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
//                    new int[] {1,     2 * 2},
//                    new int[] {1,     2 * 2 * 2},
                    new int[] {1,     2 * 2 * 2 * 2},
//                    new int[] {1,     2 * 2 * 2 * 2 * 2},
                    new int[] {1,     2 * 2 * 2 * 2 * 2 * 2}
//                    new int[] {1,     2 * 2 * 2 * 2 * 2 * 2 * 2 * 2}
                    );
        }
    },
    MPSC {
        @Override
        public List<int[]> testCase() {
            return Arrays.asList(
                    new int[] {2,                                 1},
//                    new int[] {2 * 2,                             1},
//                    new int[] {2 * 2 * 2,                         1},
                    new int[] {2 * 2 * 2 * 2,                     1},
//                    new int[] {2 * 2 * 2 * 2 * 2,                 1},
                    new int[] {2 * 2 * 2 * 2 * 2 * 2,             1}
//                    new int[] {2 * 2 * 2 * 2 * 2 * 2 * 2 * 2,     1}
                    );
        }
    },
    MPMC {
        @Override
        public List<int[]> testCase() {
            return Arrays.asList(
                    new int[] {2,                               2},
//                    new int[] {2 * 2,                           2 * 2},
//                    new int[] {2 * 2 * 2,                       2 * 2 * 2},
                    new int[] {2 * 2 * 2 * 2,                   2 * 2 * 2 * 2},
//                    new int[] {2 * 2 * 2 * 2 * 2,               2 * 2 * 2 * 2 * 2},
                    new int[] {2 * 2 * 2 * 2 * 2 * 2,           2 * 2 * 2 * 2 * 2 * 2}
//                    new int[] {2 * 2 * 2 * 2 * 2 * 2 * 2 * 2,   2 * 2 * 2 * 2 * 2 * 2 * 2 * 2}
                    );
        }
    };

    // int[0] is producer count, int[1] is consumer count
    public abstract List<int[]> testCase();
}
