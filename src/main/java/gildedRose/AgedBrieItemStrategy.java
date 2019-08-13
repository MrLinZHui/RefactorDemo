package gildedRose;

public class AgedBrieItemStrategy implements ItemStrategy {
    @Override
    public void updateItem(Item item) {
        qualityOver50(item);
        item.sellIn--;
        if (item.sellIn < 0) {
            qualityOver50(item);
        }
    }

    private void qualityOver50(Item item) {
        if (item.quality < 50) {
            item.quality++;
        }
    }
}
