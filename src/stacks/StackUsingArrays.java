package stacks;

public class StackUsingArray {

    private int[] stackData;
    private int top;

    public StackUsingArray() {
        this.stackData = new int[100];
        this.top = -1;
    }

    public StackUsingArray(int capacity) {
        this.stackData = new int[capacity];
        this.top = -1;
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public int size() {
        return this.stackData.length;
    }

    public int numberOfElements() {
        return top + 1;
    }

    public int stackTop() throws StackNoElement {
        if (this.top == -1) {
            throw new StackNoElement();
        }
        return this.stackData[this.top];
    }

    public void push(int data) throws StackOverFlow {
        if (this.top + 1 >= this.stackData.length) {
            doubleStackSize();
        }
        this.top++;
        this.stackData[this.top] = data;
    }

    public int pop() throws StackNoElement {
        if (this.top == -1) {
            throw new StackNoElement();
        }
        return this.stackData[this.top--];
    }

    private void doubleStackSize() {
        int[] tempArr = new int[this.stackData.length];

        System.arraycopy(this.stackData, 0, tempArr, 0, this.stackData.length);

        this.stackData = new int[2 * this.stackData.length];

        System.arraycopy(tempArr, 0, this.stackData, 0, tempArr.length);
    }
}
