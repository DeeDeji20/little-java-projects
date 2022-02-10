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
            if(myStack[i] == null){
                myStack[i] = element;
                count++;
                break;
            }

        }
    }

    public String[] viewStack() {
        return myStack;
    }
}
