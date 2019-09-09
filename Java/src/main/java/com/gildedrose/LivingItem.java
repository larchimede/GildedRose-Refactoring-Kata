package com.gildedrose;

class LivingItem {
    private final Item item;

    LivingItem(Item item) {
        this.item = item;
    }

    void update() {
        decreaseSellIn();
        updateQuality();
    }

    private void updateQuality() {
        if (!item.name.equals("Aged Brie")
                && !item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                decreaseQuality();
            }
        } else {
            increaseQuality();
            if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (item.sellIn < 10) {
                    increaseQuality();
                }
                if (item.sellIn < 5) {
                    increaseQuality();
                }
            }
        }
        if (item.sellIn < 0) {
            if (!item.name.equals("Aged Brie")) {
                if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                    if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                        decreaseQuality();
                    }
                } else {
                    item.quality = 0;
                }
            } else {
                increaseQuality();
            }
        }
    }

    private void decreaseSellIn() {
        if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
            item.sellIn -= 1;
        }
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
