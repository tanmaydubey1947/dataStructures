package archive.stacks.problems;

public class IsValidString {

    public static void main(String[] args) {

        System.out.println(isValid("aabcbc"));
    }

    public static boolean isValid(String s) {
// If a is at last return false, if bb is substring return false

        if (s.charAt(s.length() - 1) == 'a' || s.contains("bb")) {
            return false;
        } else {

            StringBuilder str = new StringBuilder(s);

            while (str.toString().contains("abc")) {
                str = new StringBuilder(str.toString().replace("abc", ""));
            }

            return str.toString().isEmpty();
        }

    }
}
