package array.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class SortArrayAccordingToOther {
    static void relativeSort(int[] a1, int[] a2) {

        Set<Integer> set = new HashSet<>();
        int i = 0;

        for (int a : a2) {

            if (!set.contains(a)) {

                set.add(a);

                for (int j = 0; j < a1.length; j++) {

                    if (a1[j] == a) {
                        int temp = a1[i];
                        a1[i] = a1[j];
                        a1[j] = temp;
                        i++;
                    }
                }
            }
        }

        Arrays.sort(a1, i, a1.length);

    }
}