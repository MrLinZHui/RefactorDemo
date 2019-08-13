package gildedRose;

import java.util.Arrays;
import java.util.stream.Collectors;

public class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality(Item[] items) {
        Arrays.stream(items).iterator().next().getItem();
    }

}