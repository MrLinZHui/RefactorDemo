package gildedRose;
public class GildedRose {
    Item[] items;
    public GildedRose(Item[] items) {
        this.items = items;
    }

    public  void updateQuality(Item[] items) {
        for (int i = 0; i < items.length; i++) {
            switch (items[i].name) {
                case "Aged Brie":
                    new AgedBrieItemStrategy().updateItem(items[i]);
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    new BackstageItemStrategy().updateItem(items[i]);
                    break;
                case "Sulfuras, Hand of Ragnaros":
                    new SulfurasItemStrategy().updateItem(items[i]);
                    break;
                default:
                    new SimpleItemStrategy().updateItem(items[i]);
                    break;
            }
        }
    }

}