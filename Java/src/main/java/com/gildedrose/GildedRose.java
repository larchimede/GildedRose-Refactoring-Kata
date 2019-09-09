package com.gildedrose;

import static com.gildedrose.LivingItem.*;

class GildedRose {
    private Item[] items;

    GildedRose(Item[] items) {
        this.items = items;
    }

    void updateQuality() {
        for (Item item : items) {
            createLivingItem(item).update();
        }
    }

}