package com.gildedrose;


public class Conjured extends Wrapper {
    public Conjured(Item item) {
        super(item);
    }

    public void updateQuality() {
        if (item.quality > 0) {
            item.quality--;
        }
        if (item.quality > 0) {
            item.quality--;
        }

        item.sellIn--;
        if (item.sellIn < 0) {
            if (item.quality > 0) {
                item.quality--;
            }
            if (item.quality > 0) {
                item.quality--;
            }
        }
    }
}