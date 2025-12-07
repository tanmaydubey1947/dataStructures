package archive.gfg.recursion.lectureQuestions;

public class Print1ToN {

    public static void main(String[] args) {
        print1ToN(5);
    }

    public static void print1ToN(int num){

        if(num == 0){
            return;
        } else {
            print1ToN(num - 1);
            System.out.println(num);
        }
    }
}
