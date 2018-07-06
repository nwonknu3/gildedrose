package com.gildedrose;

public class Conjured extends Wrapper {
    public Conjured(Item item) {
        super(item);
    }

    public void updateQuality() {
        if (item.quality > MIN_QUALITY) {
            item.quality--;
        }
        if (item.quality > MIN_QUALITY) {
            item.quality--;
        }

        item.sellIn--;
        if (item.sellIn < MIN_QUALITY) {
            if (item.quality > MIN_QUALITY) {
                item.quality--;
            }
            if (item.quality > MIN_QUALITY) {
                item.quality--;
            }
        }
    }
}