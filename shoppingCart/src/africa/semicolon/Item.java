package africa.semicolon;

import java.math.BigDecimal;

public class Item {
    private final String title;
    private final ItemType type;
    private final BigDecimal price;

    public Item(String title, ItemType type, BigDecimal price) {
        this.title = title;
        this.type = type;
        this.price = price;
    }
}
