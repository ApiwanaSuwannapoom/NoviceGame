import java.util.ArrayList;

public class Bag {
    private ArrayList<Item> items;
    private int limit;

    public Bag() {
        items = new ArrayList<Item>();
        limit = 10;
    }

    public void addItem(String itemName) {
        items.add(new Item(itemName));
    }

    public void showItem() {
        for (int i = 0; i < items.size(); i++) {
            items.get(i).showName();
        }
    }

}
