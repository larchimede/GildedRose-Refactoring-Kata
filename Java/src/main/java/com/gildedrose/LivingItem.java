package com.gildedrose;

class LivingItem {
    private final Item item;

    LivingItem(Item item) {
        this.item = item;
    }

    void update() {
        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            decreaseSellIn();
            updateQuality();
        }
    }

    private void updateQuality() {
        if (item.name.equals("Aged Brie")) {
            increaseQuality();
            if (item.sellIn < 0) {
                increaseQuality();
            }
        } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
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
        } else if (item.name.equals("Conjured Banana Cake")) {
            decreaseQuality();
            decreaseQuality();
            if (item.sellIn < 0) {
                decreaseQuality();
                decreaseQuality();
            }
        } else {
            decreaseQuality();
            if (item.sellIn < 0) {
                decreaseQuality();
            }
        }
    }

    private void decreaseSellIn() {
        item.sellIn -= 1;
    }

    private void decreaseQuality() {
        if (item.quality > 0) {
            item.quality -= 1;
        }
    }

    private void increaseQuality() {
        if (item.quality < 50) {
            item.quality += 1;
        }
    }
}
