package com.gildedrose;

public class AgedBrieLivingItem extends LivingItem {
    AgedBrieLivingItem(Item item) {
        super(item);
    }

    @Override
    protected void updateQuality() {
        increaseQuality();
        if (item.sellIn < 0) {
            increaseQuality();
        }
    }
}
