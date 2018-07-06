package com.gildedrose;

public class AgedBrie extends Wrapper {
    public AgedBrie(Item item) {
        super(item);
    }
    public void updateQuality() {
        if (item.quality < 50) {
            item.quality++;
        }
        item.sellIn--;
        if (item.sellIn < 0) {
            if (item.quality < 50) {
                item.quality++;
            }
        }
    }
}
