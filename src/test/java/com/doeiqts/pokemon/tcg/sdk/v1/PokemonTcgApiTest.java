package com.doeiqts.pokemon.tcg.sdk.v1;

import com.doeiqts.pokemon.tcg.domain.v1.Ability;
import com.doeiqts.pokemon.tcg.domain.v1.Attack;
import com.doeiqts.pokemon.tcg.domain.v1.Card;
import com.doeiqts.pokemon.tcg.domain.v1.Set;
import com.doeiqts.pokemon.tcg.domain.v1.Weakness;
import com.sun.jersey.core.util.MultivaluedMapImpl;
import org.junit.Assert;
import org.junit.Test;

import javax.ws.rs.core.MultivaluedMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PokemonTcgApiTest {

    @Test
    public void testGetCard() {
        Card expectedCard = generateTestCard();

        PokemonTcgApi objectUnderTest = new PokemonTcgApi();

        Card result = objectUnderTest.getCard("xy8-15");

        Assert.assertEquals("The cards didn't match.", expectedCard, result);
    }

    @Test
    public void testSearchCards() {
        List<Card> expectedCards = new ArrayList<>();
        expectedCards.add(generateTestCard());

        MultivaluedMap<String, String> searchCriteria = new MultivaluedMapImpl();
        searchCriteria.add("name", "Vivillon");
        searchCriteria.add("set", "BREAKthrough");

        PokemonTcgApi objectUnderTest = new PokemonTcgApi();

        List<Card> result = objectUnderTest.searchCards(searchCriteria);

        Assert.assertEquals("The cards didn't match.", expectedCards, result);
    }

    @Test
    public void testGetSet() {
        Set expectedSet = generateTestSet();

        PokemonTcgApi objectUnderTest = new PokemonTcgApi();

        Set result = objectUnderTest.getSet("sm2");

        Assert.assertEquals("The sets didn't match.", expectedSet, result);
    }

    @Test
    public void testGetSets() {
        List<Set> expectedSets = new ArrayList<>();
        expectedSets.add(generateTestSet());

        MultivaluedMap<String, String> searchCriteria = new MultivaluedMapImpl();
        searchCriteria.add("name", "Guardians Rising");

        PokemonTcgApi objectUnderTest = new PokemonTcgApi();

        List<Set> result = objectUnderTest.getSets(searchCriteria);

        Assert.assertEquals("The sets didn't match.", expectedSets, result);
    }

    private Set generateTestSet() {
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

    private Card generateTestCard() {
        Ability expectedAbility = new Ability();
        expectedAbility.setName("Energy Color");
        expectedAbility.setText("Once during your turn (before your attack), you may flip a coin. If heads, search your deck for a basic Energy card and attach it to 1 of your Pokémon. Shuffle your deck afterward.");
        expectedAbility.setType("Ability");

        Attack expectedAttack = new Attack();
        expectedAttack.setConvertedEnergyCost(3);
        expectedAttack.setCost(Arrays.asList("Grass","Colorless","Colorless"));
        expectedAttack.setDamage("60");
        expectedAttack.setName("Sleep Powder");
        expectedAttack.setText("Your opponent's Active Pokémon is now Asleep.");

        Weakness expectedWeakness = new Weakness();
        expectedWeakness.setType("Fire");
        expectedWeakness.setValue("×2");

        Card expectedCard = new Card();
        expectedCard.setId("xy8-15");
        expectedCard.setName("Vivillon");
        expectedCard.setAbility(expectedAbility);
        expectedCard.setArtist("Mizue");
        expectedCard.setAttacks(Arrays.asList(expectedAttack));
        expectedCard.setEvolvesFrom("Spewpa");
        expectedCard.setHp("120");
        expectedCard.setImageUrl("https://images.pokemontcg.io/xy8/15.png");
        expectedCard.setImageUrlHiRes("https://images.pokemontcg.io/xy8/15_hires.png");
        expectedCard.setNationalPokedexNumber(666);
        expectedCard.setNumber("15");
        expectedCard.setRarity("Rare Holo");
        expectedCard.setRetreatCost(Arrays.asList("Colorless"));
        expectedCard.setSeries("XY");
        expectedCard.setSet("BREAKthrough");
        expectedCard.setSetCode("xy8");
        expectedCard.setSubtype("Stage 2");
        expectedCard.setSupertype("Pokémon");
        expectedCard.setTypes(Arrays.asList("Grass"));
        expectedCard.setWeaknesses(Arrays.asList(expectedWeakness));

        return expectedCard;
    }
}
