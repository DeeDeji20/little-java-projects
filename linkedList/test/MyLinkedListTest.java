import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyLinkedListTest {
    MyLinkedList linkedList;
    @BeforeEach
    void setUp(){
        linkedList = new MyLinkedList();
    }

    @Test
    void test_that_linkedlist_exists(){
        assertNotNull(linkedList);
    }

    @Test
    void test_that_nodeclass_exists(){
        Node node = new Node();
        assertNotNull(node);
    }

    @Test
    void test_to_add_element_to_the_end_of_list(){
        linkedList.addLastItem(5);
       Node node = new Node();
       node.setValue(5);
    }

}
