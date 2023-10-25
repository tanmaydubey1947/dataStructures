package strings;

public class ShiftingLetters {

    public static void main(String[] args) {

        System.out.println(shiftingLetters("abc", new int[]{3,5,9}));
    }

    public static String shiftingLetters(String s, int[] shifts) {

        int sum = 0;

        for(int num : shifts){
            sum = sum + num;
        }

        StringBuilder result = new StringBuilder();

        for(int i = 0;i<s.length();i++){
            char ch = (char) (s.charAt(i)+sum);
            sum = sum - shifts[i];

            result.append(ch);
        }

        return result.toString();
    }
}
