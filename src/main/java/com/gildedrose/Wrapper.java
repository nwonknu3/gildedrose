package com.gildedrose;

public abstract class Wrapper {
    Item item;

    public Wrapper (Item item) {
        this.item = item;
    }

    public static Wrapper createFor(Item item) {
        if ( item.name.equals("Aged Brie")) {
            return new AgedBrie(item);
        }
        else if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
            return new Sulfuras(item);
        }
        else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            return new TAFKAL80ETC(item);
        }
        else if (item.name.contains("Conjured")) {
            return new Conjured(item);
        }
        else {
            return new Default(item);
        }
    }

    public abstract void updateQuality();
}
