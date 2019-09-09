package com.gildedrose;

public class BackstageLivingItem extends LivingItem {
    BackstageLivingItem(Item item) {
        super(item);
    }

    @Override
    protected void updateQuality() {
        if (item.sellIn < 0) {
            setQuality(0);
        } else if (item.sellIn < 5) {
            setQuality(item.quality + 3);
        } else if (item.sellIn < 10) {
            setQuality(item.quality + 2);
        } else {
            setQuality(item.quality + 1);
        }
    }

}
