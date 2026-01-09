package strings.easy;

public class AreAlmostEqual {

    public boolean areAlmostEqual(String s1, String s2) {

        int n = s1.length();
        char a1 = ' ', a2 = ' ', b1 = ' ', b2 = ' ';
        int count = 0;

        for (int i = 0; i < n; i++) {

            if (s1.charAt(i) != s2.charAt(i)) {

                if (count > 2) {
                    return false;
                }

                count++;
                if (count == 1) {
                    a1 = s1.charAt(i);
                    a2 = s2.charAt(i);
                }

                if (count == 2) {
                    b1 = s1.charAt(i);
                    b2 = s2.charAt(i);
                }
            }

        }

        if (count > 2) {
            return false;
        }

        if (count != 0) {
            return a1 == b2 && a2 == b1;
        }

        return true;
    }
}
