import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class StackTest {
    MyStack myStack;
    @BeforeEach
    void setUp(){
         myStack = new MyStack();

    }
    @Test
    public void testThatStackExists() {
        assertTrue(myStack.isEmpty());
        assertNotNull(myStack);
    }

        @Test
        public void testThatAnElementCanBeAddedtoStack() {
            myStack.push("food");
            assertFalse(myStack.isEmpty());
        }

    @Test
    public void testThatAnElementCanBeCheckedStack() {
        myStack.push("food");
        myStack.push("clothes");
        String[] actual = myStack.viewStack();
        assertArrayEquals(new String[] {"food", "clothes", null, null, null}, actual);
    }
}
