package gfg.recursion.youtube;

import java.util.ArrayList;
import java.util.List;

public class SortArray {


    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>() {
            {
                add(4);
                add(8);
                add(10);
                add(1);
                add(-1);
                add(-2);
            }
        };
        sort(arr);
        System.out.println(arr);
    }

    public static void sort(List<Integer> array) {
        if (array.size() == 1) {
            return;
        }

        int temp = array.get(array.size() - 1);
        array.remove(array.size() - 1);
        sort(array);
        insert(array, temp);

    }

    public static void insert(List<Integer> array, int temp) {

        if (array.size() == 0 || array.get(array.size() - 1) <= temp) {
            array.add(temp);
            return;
        }

        int val = array.get(array.size() - 1);
        array.remove(array.size() - 1);
        insert(array, temp);
        array.add(val);
    }

}
