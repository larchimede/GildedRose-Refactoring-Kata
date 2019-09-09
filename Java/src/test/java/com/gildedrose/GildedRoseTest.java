package com.gildedrose;

import org.approvaltests.combinations.CombinationApprovals;
import org.approvaltests.legacycode.Range;
import org.junit.Test;

import java.util.Arrays;

public class GildedRoseTest {

    @Test
    public void foo() {
        String[] names = {"foo", "Aged Brie", "Backstage passes to a TAFKAL80ETC concert", "Sulfuras, Hand of Ragnaros"};
        Integer[] qualities = {0, 1, -1, 49, 50, 51};
        Integer[] sellins = Range.get(-1, 15);
        CombinationApprovals.verifyAllCombinations(this::doStuff, names, qualities, sellins);
    }

    private String doStuff(String name, int quality, int sellIns) {
        Item[] items = new Item[]{new Item(name, sellIns, quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        return Arrays.stream(items).findFirst().get().toString();
    }

}
