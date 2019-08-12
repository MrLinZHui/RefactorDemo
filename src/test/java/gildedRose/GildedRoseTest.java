package gildedRose;

import org.junit.Assert;
import org.junit.Test;

public class GildedRoseTest {
    @Test
    public void should_correct_update_item_when_give_sellIn_1(){
        //given
        GildedRose gildedRose = new GildedRose(new Item[]{new SimpleItem("Tomi", 1, 10)});
        //when
        gildedRose.updateQuality(gildedRose.items);
        //then
        Assert.assertEquals("Tomi, 0, 9", gildedRose.items[0].toString());
    }
    @Test
    public void should_correct_update_item_when_give_sellIn_0(){
        //given
        GildedRose gildedRose = new GildedRose(new Item[]{new SimpleItem("Tomi", 0, 10)});
        //when
        gildedRose.updateQuality(gildedRose.items);
        System.out.println( gildedRose.items[0].toString());
        //then
        Assert.assertEquals("Tomi, -1, 8", gildedRose.items[0].toString());
    }
    @Test
    public void should_correct_update_item_when_give_sellIn_1_quality_50(){
        //given
        GildedRose gildedRose = new GildedRose(new Item[]{new AgedBrieItem("Aged Brie", 1, 50)});
        //when
        gildedRose.updateQuality(gildedRose.items);
        System.out.println( gildedRose.items[0].toString());
        //then
        Assert.assertEquals("Aged Brie, 0, 50", gildedRose.items[0].toString());
    }
    @Test
    public void should_correct_update_item_when_give_sellIn_0_quality_50(){
        //given
        GildedRose gildedRose = new GildedRose(new Item[]{new AgedBrieItem("Aged Brie", 0, 50)});
        //when
        gildedRose.updateQuality(gildedRose.items);
        System.out.println( gildedRose.items[0].toString());
        //then
        Assert.assertEquals("Aged Brie, -1, 50", gildedRose.items[0].toString());
    }

    @Test
    public void should_correct_update_item_when_give_sellIn_0_quality_49(){
        //given
        GildedRose gildedRose = new GildedRose(new Item[]{new AgedBrieItem("Aged Brie", 0, 49)});
        //when
        gildedRose.updateQuality(gildedRose.items);
        System.out.println( gildedRose.items[0].toString());
        //then
        Assert.assertEquals("Aged Brie, -1, 50", gildedRose.items[0].toString());
    }
    @Test
    public void should_correct_update_item_when_give_sellIn_0_quality_48(){
        //given
        GildedRose gildedRose = new GildedRose(new Item[]{new AgedBrieItem("Aged Brie", 0, 48)});
        //when
        gildedRose.updateQuality(gildedRose.items);
        System.out.println( gildedRose.items[0].toString());
        //then
        Assert.assertEquals("Aged Brie, -1, 50", gildedRose.items[0].toString());
    }
    @Test
    public void should_correct_update_item_when_give_name_is_Backstage_quality_50_sellIn_1(){
        //given
        GildedRose gildedRose = new GildedRose(new Item[]{new BackstageItem("Backstage passes to a TAFKAL80ETC concert", 1, 50)});
        //when
        gildedRose.updateQuality(gildedRose.items);
        System.out.println( gildedRose.items[0].toString());
        //then
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 0, 50", gildedRose.items[0].toString());
    }

    @Test
    public void should_correct_update_item_when_give_name_is_Backstage_quality_50_sellIn_0(){
        //given
        GildedRose gildedRose = new GildedRose(new Item[]{new BackstageItem("Backstage passes to a TAFKAL80ETC concert", 0, 50)});
        //when
        gildedRose.updateQuality(gildedRose.items);
        System.out.println( gildedRose.items[0].toString());
        //then
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, -1, 0", gildedRose.items[0].toString());
    }
    @Test
    public void should_correct_update_item_when_give_name_is_Backstage_quality_49_sellIn_1(){
        //given
        GildedRose gildedRose = new GildedRose(new Item[]{new BackstageItem("Backstage passes to a TAFKAL80ETC concert", 1, 49)});
        //when
        gildedRose.updateQuality(gildedRose.items);
        System.out.println( gildedRose.items[0].toString());
        //then
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 0, 50", gildedRose.items[0].toString());
    }
    @Test
    public void should_correct_update_item_when_give_name_is_Backstage_quality_47_sellIn_5(){
        //given
        GildedRose gildedRose = new GildedRose(new Item[]{new BackstageItem("Backstage passes to a TAFKAL80ETC concert", 5, 47)});
        //when
        gildedRose.updateQuality(gildedRose.items);
        System.out.println( gildedRose.items[0].toString());
        //then
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 4, 50", gildedRose.items[0].toString());
    }
    @Test
    public void should_correct_update_item_when_give_name_is_Backstage_quality_48_sellIn_1(){
        //given
        GildedRose gildedRose = new GildedRose(new Item[]{new BackstageItem("Backstage passes to a TAFKAL80ETC concert", 1, 48)});
        //when
        gildedRose.updateQuality(gildedRose.items);
        System.out.println( gildedRose.items[0].toString());
        //then
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 0, 50", gildedRose.items[0].toString());
    }
    @Test
    public void should_correct_update_item_when_give_name_is_Backstage_quality_48_sellIn_0(){
        //given
        GildedRose gildedRose = new GildedRose(new Item[]{new BackstageItem("Backstage passes to a TAFKAL80ETC concert", 1, 50)});
        //when
        gildedRose.updateQuality(gildedRose.items);
        System.out.println( gildedRose.items[0].toString());
        //then
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 0, 50", gildedRose.items[0].toString());
    }
    @Test
    public void should_correct_update_item_when_give_name_is_Backstage_quality_49_sellIn_0(){
        //given
        GildedRose gildedRose = new GildedRose(new Item[]{new BackstageItem("Backstage passes to a TAFKAL80ETC concert", 1, 49)});
        //when
        gildedRose.updateQuality(gildedRose.items);
        System.out.println( gildedRose.items[0].toString());
        //then
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 0, 50", gildedRose.items[0].toString());
    }
    @Test
    public void should_correct_update_item_when_give_name_is_Backstage_quality_50_sellIn_6(){
        //given
        GildedRose gildedRose = new GildedRose(new Item[]{new BackstageItem("Backstage passes to a TAFKAL80ETC concert", 6, 50)});
        //when
        gildedRose.updateQuality(gildedRose.items);
        System.out.println( gildedRose.items[0].toString());
        //then
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 5, 50", gildedRose.items[0].toString());
    }
    @Test
    public void should_correct_update_item_when_give_name_is_Backstage_quality_49_sellIn_6(){
        //given
        GildedRose gildedRose = new GildedRose(new Item[]{new BackstageItem("Backstage passes to a TAFKAL80ETC concert", 6, 49)});
        //when
        gildedRose.updateQuality(gildedRose.items);
        System.out.println( gildedRose.items[0].toString());
        //then
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 5, 50", gildedRose.items[0].toString());
    }
    @Test
    public void should_correct_update_item_when_give_name_is_Backstage_quality_48_sellIn_6(){
        //given
        GildedRose gildedRose = new GildedRose(new Item[]{new BackstageItem("Backstage passes to a TAFKAL80ETC concert", 6, 48)});
        //when
        gildedRose.updateQuality(gildedRose.items);
        System.out.println( gildedRose.items[0].toString());
        //then
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 5, 50", gildedRose.items[0].toString());
    }
    @Test
    public void should_correct_update_item_when_give_name_is_Backstage_quality_48_sellIn_11(){
        //given
        GildedRose gildedRose = new GildedRose(new Item[]{new BackstageItem("Backstage passes to a TAFKAL80ETC concert", 11, 48)});
        //when
        gildedRose.updateQuality(gildedRose.items);
        System.out.println( gildedRose.items[0].toString());
        //then
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 10, 49", gildedRose.items[0].toString());
    }
    @Test
    public void should_correct_update_item_when_give_name_is_Backstage_quality_49_sellIn_11(){
        //given
        GildedRose gildedRose = new GildedRose(new Item[]{new BackstageItem("Backstage passes to a TAFKAL80ETC concert", 11, 49)});
        //when
        gildedRose.updateQuality(gildedRose.items);
        System.out.println( gildedRose.items[0].toString());
        //then
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 10, 50", gildedRose.items[0].toString());
    }
    @Test
    public void should_correct_update_item_when_give_name_is_Backstage_quality_50_sellIn_11(){
        //given
        GildedRose gildedRose = new GildedRose(new Item[]{new BackstageItem("Backstage passes to a TAFKAL80ETC concert", 11, 50)});
        //when
        gildedRose.updateQuality(gildedRose.items);
        System.out.println( gildedRose.items[0].toString());
        //then
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 10, 50", gildedRose.items[0].toString());
    }

    @Test
    public void should_correct_update_item_when_give_name_is_Sulfuras_quality_50_sellIn_1(){
        //given
        GildedRose gildedRose = new GildedRose(new Item[]{new SulfurasItem("Sulfuras, Hand of Ragnaros", 1, 50)});
        //when
        gildedRose.updateQuality(gildedRose.items);
        System.out.println( gildedRose.items[0].toString());
        //then
        Assert.assertEquals("Sulfuras, Hand of Ragnaros, 1, 50", gildedRose.items[0].toString());
    }

}