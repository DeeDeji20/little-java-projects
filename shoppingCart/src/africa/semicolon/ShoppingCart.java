package africa.semicolon;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingCart {
    private ArrayList<LineItem> items = new ArrayList<>();
    private int totalItem;

    public void addItem(LineItem... item) {
        items.addAll(Arrays.asList(item));
        for (LineItem itemVal : items) {
            totalItem++;
        }
    }

    public int getTotal() {
        return totalItem;
    }
}
