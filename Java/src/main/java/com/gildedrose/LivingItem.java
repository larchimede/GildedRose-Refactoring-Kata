package com.gildedrose;

class LivingItem {
    protected final Item item;
    int quality_adjustement;

    LivingItem(Item item) {
        this.item = item;
        quality_adjustement = 1;
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
        if (item.sellIn >= 0) {
            setQuality(item.quality - quality_adjustement);
        } else {
            setQuality(item.quality - 2 * quality_adjustement);
        }
    }

    private void decreaseSellIn() {
        item.sellIn -= 1;
    }

    void setQuality(int quality) {
        if (quality < 0) {
            item.quality = 0;
        } else if (quality > 50) {
            item.quality = 50;
        } else {
            item.quality = quality;
        }
    }

}
