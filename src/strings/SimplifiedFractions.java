package strings;

import java.util.*;

public class SimplifiedFractions {

    /**
     * Leetcode Link : <a href="https://leetcode.com/problems/simplified-fractions/description/">...</a>
     * <p>
     * Iteration for better approach : 1
     * <p>
     *      Create a method which will create the fractions, now that particular method will return a string with "/" symbol with it. Once that fraction is ready.
     *      We need to pass that string into one more method which will simplify it using GCD. Now to avoid duplicate fractions used Set. Once all the fractions are
     *      ready we can simply return the result list by parsing the Set of fractions.
     * <p>
     * Time Complexity : O(n^2)
     * </p>
     */

    public static void main(String[] args) {
        System.out.println(simplifiedFractions(4));
    }

    public static List<String> simplifiedFractions(int n) {

        Set<String> resultSet = new HashSet<>();

        for (int i = 2; i <= n; i++) {

            List<String> fractions = createFraction(i);
            for (String fraction : fractions) {
                String result = simplifyFraction(fraction);
                resultSet.add(result);
            }
        }

        return new ArrayList<>(resultSet);
    }

    private static List<String> createFraction(int num) {

        List<String> fractions = new ArrayList<>();

        for(int i =1; i<num;i++){
            fractions.add(i+"/"+num);
        }

        return fractions;
    }

    private static String simplifyFraction(String num) {

        String[] nums = num.split("/");

        int numerator = Integer.parseInt(nums[0]);
        int denominator = Integer.parseInt(nums[1]);

        int n1 = numerator;
        int n2 = denominator;

        while(n1!=n2)
        {
            if(n1>n2)
                n1=n1-n2;
            else
                n2=n2-n1;
        }

        numerator = numerator / n2;
        denominator = denominator / n2;

        return numerator+"/"+denominator;
    }


}
