package hackerRank;

import java.util.HashMap;
import java.util.Map;

public class DiagonalDifference {

    public static void main(String[] args) {

//        int n = sockMerchant(9, (new ArrayList<Integer>() {{
//            add(10);
//            add(20);
//            add(20);
//            add(10);
//            add(10);
//            add(30);
//            add(50);
//            add(10);
//            add(20);
//        }}));

        //System.out.println(subarraysDivByK(new int[]{4, 5, 0, -2, -3, 1}, 5));

        // System.out.println(numSubarrayBoundedMax(new int[]{2, 9, 2, 5, 6}, 2, 8));


//        System.out.println(checkSubarraySum(new int[]{23, 2, 4, 6, 7}, 6));

        // System.out.println(minOperations(5));

     //   System.out.println(isIsomorphic("foo", "bar"));

        System.out.println(numOfPairs(new String[]{"1","111"}, "11"));

    }


    public static int numOfPairs(String[] nums, String target) {
        int count = 0;


        for(int i = 0;i<nums.length;i++){
            for(int j = 0;j<nums.length;j++){
                if(j!=i){
                    if((nums[i] + nums[j]).equals(target)){
                        count++;
                    }
                }
            }
        }

        return count;
    }


    public static boolean isIsomorphic(String s, String t) {

        Map<Character, Character> map_s = new HashMap<>();
        Map<Character, Character> map_t = new HashMap<>();

        for (int i = 0; i < s.length() - 1; i++) {

            if (!map_s.isEmpty() && map_s.containsKey(s.charAt(i))) {
                Character temp = map_s.get(s.charAt(i));

                if (t.charAt(i) != temp) {
                    return false;
                }
            }

            if (!map_t.isEmpty() && map_t.containsKey(t.charAt(i))) {
                char temp = map_t.get(t.charAt(i));

                if (temp != s.charAt(i)) {
                    return false;
                }
            }

            map_s.put(s.charAt(i), t.charAt(i));
            map_t.put(t.charAt(i), s.charAt(i));


        }

        return true;

    }


    public int pivotIndex(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            int leftSum = 0, rightSum = 0;

            for (int j = 0; j < nums.length; j++) {
                if (j == i) {
                } else if (j < i) {
                    leftSum = leftSum + nums[j];
                } else {
                    rightSum = rightSum + nums[j];
                }
            }

            if (rightSum == leftSum) {
                return i;
            }

        }


        return -1;

    }


    public static int[] circularGameLosers(int n, int k) {

        int[] arr = new int[n];
        int temp = 1;
        arr[0] = -1;

        for (int i = 0; i < n; i++) {

            if (arr[i] < -1) {
                break;
            } else {
                arr[i + (k * temp)]--;
                temp++;
            }


        }

        return null;

    }


    public static int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int count = 0, ans = 0, i = 0, j = 0;

        while (j < nums.length) {
            if (nums[j] > right) {
                count = 0;
                i = j + 1;
            } else if (nums[j] >= left && nums[j] <= right) {
                count = j - i + 1;
            }
            ans += count;
            j++;
        }

        return ans;
    }


    public static boolean checkSubarraySum(int[] nums, int k) {

        int n = nums.length;
        if (n < 2) {
            return false;
        }

        int prefixSum = 0;
        Map<Integer, Integer> remainderMap = new HashMap<>();
        remainderMap.put(0, -1);

        for (int i = 0; i < n; i++) {
            prefixSum += nums[i];
            int remainder = prefixSum % k;
            if (remainderMap.containsKey(remainder)) {
                if (i - remainderMap.get(remainder) > 1) {
                    return true;
                }
            } else {
                remainderMap.put(remainder, i);
            }
        }

        return false;
    }


    public static int minOperations(int n) {

        int result = 0;


        for (int i = 1; i <= n; i = i + 2) {
            result = result + (n - i);
        }

        return result;

    }
}
