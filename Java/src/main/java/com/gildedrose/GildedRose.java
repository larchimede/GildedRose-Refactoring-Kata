package com.gildedrose;

class GildedRose {
    private Item[] items;

    GildedRose(Item[] items) {
        this.items = items;
    }

    void updateQuality() {
        for (Item item : items) {
            new ItemWrapper(item).updateQuality();
        }
    }

}