package africa.semicolon;

public class LineItem {
    private Item items;
    private int quantity;

    public LineItem(Item items, int quantity) {
        this.items = items;
        this.quantity = quantity;
    }

    public LineItem(Item items) {
        this(items, 1);
    }
}
