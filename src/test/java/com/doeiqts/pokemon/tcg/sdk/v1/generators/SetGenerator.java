package com.doeiqts.pokemon.tcg.sdk.v1.generators;

import com.doeiqts.pokemon.tcg.domain.v1.Set;

public class SetGenerator {
    public static Set generateTestSet() {
        Set expectedSet = new Set();
        expectedSet.setCode("sm2");
        expectedSet.setName("Guardians Rising");
        expectedSet.setExpandedLegal(true);
        expectedSet.setReleaseDate("05/05/2017");
        expectedSet.setSeries("Sun & Moon");
        expectedSet.setStandardLegal(true);
        expectedSet.setTotalCards(145);

        return expectedSet;
    }
}
