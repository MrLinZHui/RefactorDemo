package gildedRose;
public class GildedRose {
    Item[] items;
    //ItemStrategy itemStrategy;
    public GildedRose(Item[] items) {
        this.items = items;
    }

    public  void updateQuality(Item[] items) {
        for (int i = 0; i < items.length; i++) {
            if(items[i].name.equals("Aged Brie")){
                new AgedBrieItemStrategy().updateItem(items[i]);
            }else if(items[i].name.equals("Backstage passes to a TAFKAL80ETC concert")){
                new BackstageItemStrategy().updateItem(items[i]);
            }else if(items[i].name.equals("Sulfuras, Hand of Ragnaros")){
                new SulfurasItemStrategy().updateItem(items[i]);
            }else{
                new SimpleItemStrategy().updateItem(items[i]);
            }
        }
    }

}