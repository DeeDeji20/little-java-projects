public class MyStack {

    private boolean isEmpty = true;
    private String[] myStack = new String[5];
    private int count;

    public boolean isEmpty() {
        if (count> 0) return !isEmpty;
        return isEmpty;
    }

    public void push(String element) {
        for (int i = 0; i < myStack.length; i++) {
            myStack[i] = element;
            count++;
        }
    }
}
