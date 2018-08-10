package com.doeiqts.pokemon.tcg.sdk.v1.generators;

import com.doeiqts.pokemon.tcg.domain.v1.Ability;
import com.doeiqts.pokemon.tcg.domain.v1.Attack;
import com.doeiqts.pokemon.tcg.domain.v1.Card;
import com.doeiqts.pokemon.tcg.domain.v1.Weakness;

import java.util.Arrays;

public class CardGenerator {
    public static Card generateTestCard() {
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
