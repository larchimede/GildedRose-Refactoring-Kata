package com.gildedrose;

public class BackstageLivingItem extends LivingItem {
    BackstageLivingItem(Item item) {
        super(item);
    }

    @Override
    protected void updateQuality() {
        increaseQuality();
        if (item.sellIn < 10) {
            increaseQuality();
        }
        if (item.sellIn < 5) {
            increaseQuality();
        }
        if (item.sellIn < 0) {
            item.quality = 0;
        }
    }

}
