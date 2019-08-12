package gildedRose;
public class GildedRose {
    Item[] items;
    public GildedRose(Item[] items) {
        this.items = items;
    }

    public  void updateQuality(Item[] items) {
        for (Item item : items) {
            switch (item.name) {
                case "Aged Brie":
                    new AgedBrieItemStrategy().updateItem(item);
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    new BackstageItemStrategy().updateItem(item);
                    break;
                case "Sulfuras, Hand of Ragnaros":
                    new SulfurasItemStrategy().updateItem(item);
                    break;
                default:
                    new SimpleItemStrategy().updateItem(item);
                    break;
            }
        }
    }

}