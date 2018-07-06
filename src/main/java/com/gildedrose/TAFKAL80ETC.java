package com.gildedrose;

public class TAFKAL80ETC extends Wrapper {
    public TAFKAL80ETC(Item item) {
        super(item);

    }

    public void updateQuality() {
        if (item.quality < MAX_QUALITY) {
            item.quality ++;
            if (item.sellIn < 11) {
                if (item.quality < MAX_QUALITY) {
                    item.quality++;
                }
            }
            if (item.sellIn < 6) {
                if (item.quality < MAX_QUALITY) {
                    item.quality++;
                }
            }
        }
        item.sellIn--;
        if (item.sellIn < MIN_QUALITY) {
            item.quality = MIN_QUALITY;
        }
    }
}
