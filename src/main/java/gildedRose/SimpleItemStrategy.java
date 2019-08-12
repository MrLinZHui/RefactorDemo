package gildedRose;

public class SimpleItemStrategy implements ItemStrategy{
    @Override
    public void updateItem(Item item) {
        reduceQuality(item);
        item.sellIn--;
        if(item.sellIn<0){
            reduceQuality(item);
        }
    }

    private void reduceQuality(Item item) {
        if (item.quality > 0) {
            item.quality--;
        }
    }
}
