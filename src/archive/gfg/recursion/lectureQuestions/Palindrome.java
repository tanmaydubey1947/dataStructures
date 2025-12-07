package archive.gfg.recursion.lectureQuestions;

public class Palindrome {

    public static void main(String[] args) {

        System.out.println(isPalindrome("abbaabba", 0, 7));
    }

    public static boolean isPalindrome(String str, int start, int end){

        if(start>=end){
            return true;
        } else {
            return (str.charAt(start) == str.charAt(end))
                    && isPalindrome(str, start+1, end-1);
        }
    }
}
