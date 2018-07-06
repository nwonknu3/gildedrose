package com.gildedrose;

public class AgedBrie extends Wrapper {
    public AgedBrie(Item item) {
        super(item);
    }
    public void updateQuality() {
        if (item.quality < MAX_QUALITY) {
            item.quality++;
        }
        item.sellIn--;
        if (item.sellIn < MIN_QUALITY) {
            if (item.quality < MAX_QUALITY) {
                item.quality++;
            }
        }
    }
}
