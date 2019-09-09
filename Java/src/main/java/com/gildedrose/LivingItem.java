package com.gildedrose;

class LivingItem {
    protected final Item item;

    LivingItem(Item item) {
        this.item = item;
    }

    static LivingItem createLivingItem(Item item) {
        LivingItem livingItem;
        switch (item.name) {
            case "Aged Brie":
                livingItem = new AgedBrieLivingItem(item);
                break;
            case "Backstage passes to a TAFKAL80ETC concert":
                livingItem = new BackstageLivingItem(item);
                break;
            case "Conjured Banana Cake":
                livingItem = new ConjuredLivingItem(item);
                break;
            case "Sulfuras, Hand of Ragnaros":
                livingItem = new SulfurasLivingItem(item);
                break;
            default:
                livingItem = new LivingItem(item);
        }
        return livingItem;
    }

    void update() {
        decreaseSellIn();
        updateQuality();
    }

    protected void updateQuality() {
        decreaseQuality();
        if (item.sellIn < 0) {
            decreaseQuality();
        }
    }

    private void decreaseSellIn() {
        item.sellIn -= 1;
    }

    void decreaseQuality() {
        if (item.quality > 0) {
            item.quality -= 1;
        }
    }

    void increaseQuality() {
        if (item.quality < 50) {
            item.quality += 1;
        }
    }
}
