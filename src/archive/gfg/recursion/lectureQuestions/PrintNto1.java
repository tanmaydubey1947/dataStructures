package archive.gfg.recursion.lectureQuestions;

public class PrintNto1 {

    public static void main(String[] args) {
        printNto1(5);
    }

    public static void printNto1(int num){

        if(num == 0){
            return;
        } else {
            System.out.println(num);
            printNto1(num-1);
        }
    }
}
