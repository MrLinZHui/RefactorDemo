package gildedRose;
public class GildedRose {
    Item[] items;
    public GildedRose(Item[] items) {
        this.items = items;
    }

    public  void updateQuality(Item[] items) {
        for (Item item : items) {
            item.getItem();
        }
    }

}