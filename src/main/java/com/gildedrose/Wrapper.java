package com.gildedrose;

public abstract class Wrapper {
    Item item;

    int MAX_QUALITY = 50;
    int MIN_QUALITY = 0;


    static final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    static final String AGED_BRIE = "Aged Brie";
    static final String CONJURED = "Conjured";
    static final String TAFKAL80ETC = "Backstage passes to a TAFKAL80ETC concert";


    public Wrapper (Item item) {
        this.item = item;
    }

    public static Wrapper createFor(Item item) {
        if ( item.name.equals(AGED_BRIE)) {
            return new AgedBrie(item);
        }
        else if (item.name.equals(SULFURAS)) {
            return new Sulfuras(item);
        }
        else if (item.name.equals(TAFKAL80ETC)) {
            return new TAFKAL80ETC(item);
        }
        else if (item.name.contains(CONJURED)) {
            return new Conjured(item);
        }
        else {
            return new Default(item);
        }
    }

    public abstract void updateQuality();
}
