package gildedRose;

public class SimpleItem extends Item {
    public SimpleItem(String name, int sellIn, int quality) {
        super(name, sellIn, quality);
        this.itemStrategy = new SimpleItemStrategy();
    }
}
