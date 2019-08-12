package gildedRose;

public abstract class Item {

    public String name;

    public int sellIn;

    public int quality;

    public ItemStrategy itemStrategy;
    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    void getItem() {
//        switch (name) {
//            case "Aged Brie":
//                new AgedBrieItemStrategy().updateItem(this);
//                break;
//            case "Backstage passes to a TAFKAL80ETC concert":
//                new BackstageItemStrategy().updateItem(this);
//                break;
//            case "Sulfuras, Hand of Ragnaros":
//                new SulfurasItemStrategy().updateItem(this);
//                break;
//            default:
//                new SimpleItemStrategy().updateItem(this);
//                break;
//        }
        itemStrategy.updateItem(this);
    }
}
