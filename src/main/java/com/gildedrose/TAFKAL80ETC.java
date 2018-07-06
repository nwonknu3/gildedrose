package com.gildedrose;

public class TAFKAL80ETC extends Wrapper {

    public TAFKAL80ETC(Item item) {
        super(item);

    }
    public void updateQuality() {

        if (item.quality < 50) {
            item.quality ++;
            if (item.sellIn < 11) {
                if (item.quality < 50) {
                    item.quality++;
                }
            }
            if (item.sellIn < 6) {
                if (item.quality < 50) {
                    item.quality++;
                }
            }
        }
        item.sellIn--;
        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }
}
