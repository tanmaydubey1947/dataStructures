package strings;

import java.util.Arrays;

public class ArrangeWords {

    public static void main(String[] args) {

        System.out.println(arrangeWords("Leetcode is cool"));

    }

    public static String arrangeWords(String text) {

        String[] splitText = text.split(" ");

        for (int i=1 ;i<splitText.length; i++)
        {
            String temp =splitText[i];

            int j = i - 1;
            while (j >= 0 && temp.length() < splitText[j].length())
            {
                splitText[j+1] = splitText[j];
                j--;
            }
            splitText[j+1] = temp;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < splitText.length; i++) {
            result.append(splitText[i]).append(" ");
        }

        result = new StringBuilder(result.toString().trim().toLowerCase());
        result.replace(0, 1, String.valueOf(result.charAt(0)).toUpperCase());

        return result.toString();

    }
}
