package com.doeiqts.pokemon.tcg.sdk.v1;

import com.doeiqts.pokemon.tcg.domain.v1.Card;
import com.doeiqts.pokemon.tcg.domain.v1.Set;
import com.doeiqts.pokemon.tcg.sdk.v1.generators.CardGenerator;
import com.doeiqts.pokemon.tcg.sdk.v1.generators.SetGenerator;
import com.sun.jersey.core.util.MultivaluedMapImpl;
import org.junit.Assert;
import org.junit.Test;

import javax.ws.rs.core.MultivaluedMap;
import java.util.ArrayList;
import java.util.List;

public class PokemonTcgApiTest {

    @Test
    public void testGetCard() {
        Card expectedCard = CardGenerator.generateTestCard();

        PokemonTcgApi objectUnderTest = new PokemonTcgApi();

        Card result = objectUnderTest.getCard("xy8-15");

        Assert.assertEquals("The cards didn't match.", expectedCard, result);
    }

    @Test
    public void testSearchCards() {
        List<Card> expectedCards = new ArrayList<>();
        expectedCards.add(CardGenerator.generateTestCard());

        MultivaluedMap<String, String> searchCriteria = new MultivaluedMapImpl();
        searchCriteria.add("name", "Vivillon");
        searchCriteria.add("set", "BREAKthrough");

        PokemonTcgApi objectUnderTest = new PokemonTcgApi();

        List<Card> result = objectUnderTest.searchCards(searchCriteria);

        Assert.assertEquals("The cards didn't match.", expectedCards, result);
    }

    @Test
    public void testGetSet() {
        Set expectedSet = SetGenerator.generateTestSet();

        PokemonTcgApi objectUnderTest = new PokemonTcgApi();

        Set result = objectUnderTest.getSet("sm2");

        Assert.assertEquals("The sets didn't match.", expectedSet, result);
    }

    @Test
    public void testGetSets() {
        List<Set> expectedSets = new ArrayList<>();
        expectedSets.add(SetGenerator.generateTestSet());

        MultivaluedMap<String, String> searchCriteria = new MultivaluedMapImpl();
        searchCriteria.add("name", "Guardians Rising");

        PokemonTcgApi objectUnderTest = new PokemonTcgApi();

        List<Set> result = objectUnderTest.getSets(searchCriteria);

        Assert.assertEquals("The sets didn't match.", expectedSets, result);
    }
}
