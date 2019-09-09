package com.gildedrose;

public class ConjuredLivingItem extends LivingItem {
    ConjuredLivingItem(Item item) {
        super(item);
    }

    @Override
    protected void updateQuality() {
        decreaseQuality();
        decreaseQuality();
        if (item.sellIn < 0) {
            decreaseQuality();
            decreaseQuality();
        }
    }
}
