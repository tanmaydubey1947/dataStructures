package archive.stacks;

public class CustomStack {

    int[] arr;
    int size;
    int top = -1;

    public CustomStack(int maxSize) {
        this.arr = new int[maxSize];
        this.size = maxSize;
    }

    public void push(int x) {

        if (top < size - 1) {
            top++;
            arr[top] = x;
        }
    }

    public int pop() {

        if (top >= 0) {
            int value = arr[top];
            top = top-1;
            return value;
        } else {
            return -1;
        }

    }

    public void increment(int k, int val) {

        if(top+1>=k){
            for(int i = 0;i<k;i++){
                arr[i] = arr[i] + val;
            }
        } else{
            for(int i=0;i<=top;i++){
                arr[i] = arr[i]+val;
            }
        }

    }


    public static void main(String[] args) {

        CustomStack customStack = new CustomStack(3);
        customStack.push(3);
        customStack.push(2);
        System.out.println(customStack.pop());
        customStack.push(2);
        customStack.push(3);
        customStack.push(4);
        customStack.increment(5,100);
        customStack.increment(2,100);
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
        System.out.println(customStack.pop());
    }
}

