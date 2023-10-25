package bitManipulation;

import java.util.*;

public class BitManipulation {

    public static void main(String[] args) {

        System.out.println(~-32);

       // System.out.println(findWinners(new int[][]{{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}}));


    }

    public static boolean isPowerOfTwo(long n) {

        return n > 0 && (n & (n - 1)) == 0;

    }


    public int minMoves(int[] nums) {

        if (nums.length == 0)
            return 0;

        int min = nums[0];

        for (int n : nums)
            min = Math.min(min, n);

        int res = 0;

        for (int n : nums)
            res = res + n - min;

        return res;
    }


    public static List<List<Integer>> findWinners(int[][] matches) {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int i = 0;i<matches.length;i++){

            int winner = matches[i][0];
            int looser = matches[i][1];

            if(!map.containsKey(winner)){
                map.put(winner, 0);
            }

            if(map.containsKey(looser)){
                int match = map.get(looser);
                map.put(looser, ++match);
            } else{
                map.put(looser, 1);
            }
        }

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> winner = new ArrayList<>();
        List<Integer> looser = new ArrayList<>();

        Set<Integer> keys = map.keySet();

        for(int num : keys){

            if(map.get(num) == 0){
                winner.add(num);
            }

            if(map.get(num) == 1){
                looser.add(num);
            }

        }

        result.add(winner);
        result.add(looser);

        return result;


    }
}
