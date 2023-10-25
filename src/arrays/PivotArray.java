package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PivotArray {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(pivotArray(new int[]{9, 12, 5, 10, 14, 3, 10}, 10)));
    }


    public static int[] pivotArray(int[] nums, int pivot) {

        List<Integer> smallList = new ArrayList<>();
        List<Integer> largeList = new ArrayList<>();
        int pivotCount = 0;

        for(int num : nums){
            if(num == pivot){
                pivotCount++;
            }
            if(num < pivot){
                smallList.add(num);
            } else if(num > pivot){
                largeList.add(num);
            }
        }

        for(int i = 1;i<=pivotCount;i++){
            smallList.add(pivot);
        }

        smallList.addAll(largeList);
        int i = 0;

        for(int num : smallList){
            nums[i] = num;
            i++;
        }

        return nums;
    }
}
