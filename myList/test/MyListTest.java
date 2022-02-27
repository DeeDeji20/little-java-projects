import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

//import static org.junit.jupiter.api.AssertEquals.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class MyListTest {
    MyList myList;
    @BeforeEach
    void setUp(){
        myList = new MyList(3);
    }
    @Test
    void test_for_myList_class(){
        assertNotNull(myList);
    }

    @Test
    void test_that_items_can_be_printed(){
        assertArrayEquals(new int[]{0, 0, 0}, myList.print());
    }

    @Test
    void test_that_when_array_is_empty_assert_that_it_is_empty(){
        assertTrue(myList.isEmpty());
    }

    @Test
    void test_that_items_can_be_counted(){
        assertEquals(0, myList.count());
    }

    @Test
    void test_that_items_can_be_inserted(){
        myList.insert(10);
        assertEquals(1, myList.count());
        assertFalse(myList.isEmpty());
    }

    @Test
    void test_that_checkcks_capacity(){
        assertEquals(3, myList.capacity());
    }
    @Test
    void test_that_when_array_is_full_array_is_resized(){
        myList.insert(10);
        myList.insert(20);
        myList.insert(30);
        myList.insert(40);
        assertFalse(myList.isEmpty());
        assertEquals(6, myList.capacity());
        assertArrayEquals(new int[]{10, 20, 30, 40, 0, 0}, myList.print());
    }

//    @Test
//    void test_that_element
}
