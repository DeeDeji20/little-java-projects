package africa.semicolon;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ShoppingCartTest {
    @Test
    public void test_that_one_item_can_be_added_to_cart() {
        ShoppingCart cart = new ShoppingCart();
        LineItem item = new LineItem(new Item("My book", ItemType.BOOK, BigDecimal.valueOf(4000)), 1);
        cart.addItem(item);
        int total = cart.getTotal();
        assertEquals(1, total);
    }

    @Test
    public void test_that_multiple_items_can_be_created_added_to_cart() {
        ShoppingCart cart = new ShoppingCart();
        LineItem item1= new LineItem(new Item("My book", ItemType.BOOK, BigDecimal.valueOf(4000)), 1);
        LineItem item2= new LineItem(new Item("My book", ItemType.BOOK, BigDecimal.valueOf(4000)), 1);
        cart.addItem(item1,item2);
        int total = cart.getTotal();
        assertEquals(2, total);
    }

    @Test
    public void test_that_multiple_qty_of_items_can_be_added_to_cart(){
        ShoppingCart cart = new ShoppingCart();
        LineItem item1= new LineItem(new Item("My book", ItemType.BOOK, BigDecimal.valueOf(4000)), 1);
        cart.addItem(item1);
        int total = cart.getTotal();
        assertEquals(1, total);
    }
}