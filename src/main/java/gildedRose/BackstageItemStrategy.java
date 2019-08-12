package gildedRose;

public class BackstageItemStrategy implements ItemStrategy{
    @Override
    public void updateItem(Item item) {
        if(item.quality < 50){
            item.quality++;
            if(item.sellIn < 11 && item.quality < 50){
                item.quality = (item.sellIn<6&&item.quality<49)?item.quality+2:item.quality+1;
            }
        }
        item.sellIn--;
        if(item.sellIn < 0){
            item.quality = 0;
        }
    }
}
