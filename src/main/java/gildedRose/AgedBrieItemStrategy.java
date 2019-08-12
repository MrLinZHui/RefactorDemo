package gildedRose;

public class AgedBrieItemStrategy implements ItemStrategy{
    @Override
    public void updateItem(Item item) {
        if(item.quality<50){
            item.quality++;
        }
        item.sellIn--;
        if(item.sellIn<0&&item.quality<50){
            item.quality ++;
        }
        if(item.sellIn<0 && item.quality >0){
            item.quality--;
        }

    }
}
