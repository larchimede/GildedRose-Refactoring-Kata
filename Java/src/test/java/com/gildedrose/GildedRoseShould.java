package com.gildedrose;

import org.approvaltests.combinations.CombinationApprovals;
import org.approvaltests.legacycode.Range;
import org.junit.Test;

import java.util.Arrays;

public class GildedRoseShould {

    @Test
    public void not_break_unless_there_is_a_regression_on_Aged_or_Backstage_or_Sulfuras_or_Normal_items() {
        String[] names = {"foo", "Aged Brie", "Backstage passes to a TAFKAL80ETC concert", "Sulfuras, Hand of Ragnaros"};
        Integer[] qualities = {0, 1, -1, 49, 50, 51};
        Integer[] sellins = Range.get(-1, 15);
        CombinationApprovals.verifyAllCombinations(this::updateItemQuality, names, qualities, sellins);
    }

    @Test
    public void decrease_quality_twice_as_fast_than_normal_for_conjured_items() {
        String[] names = {"Conjured Banana Cake"};
        Integer[] qualities = {6};
        Integer[] sellins = {-1, 0, 1};
        CombinationApprovals.verifyAllCombinations(this::updateItemQuality, names, qualities, sellins);
    }

    private String updateItemQuality(String name, int quality, int sellIns) {
        Item[] items = new Item[]{new Item(name, sellIns, quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        return Arrays.stream(items).findFirst().get().toString();
    }

}
