package com.doeiqts.pokemon.tcg.domain.v1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "card")
public class Card implements Serializable {
    private static final ObjectMapper MAPPER = new ObjectMapper();

    @JsonProperty("id")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("ability")
    private Ability ability;

    @JsonProperty("ancientTrait")
    private AncientTrait ancientTrait;

    @JsonProperty("artist")
    private String artist;

    @JsonProperty("attacks")
    private List<Attack> attacks;

    @JsonProperty("evolvesFrom")
    private String evolvesFrom;

    @JsonProperty("hp")
    private String hp;

    @JsonProperty("imageUrl")
    private String imageUrl;

    @JsonProperty("imageUrlHiRes")
    private String imageUrlHiRes;

    @JsonProperty("nationalPokedexNumber")
    private Integer nationalPokedexNumber;

    @JsonProperty("number")
    private String number;

    @JsonProperty("rarity")
    private String rarity;

    @JsonProperty("resistances")
    private List<Resistance> resistances;

    @JsonProperty("retreatCost")
    private List<String> retreatCost;

    @JsonProperty("series")
    private String series;

    @JsonProperty("set")
    private String set;

    @JsonProperty("setCode")
    private String setCode;

    @JsonProperty("subtype")
    private String subtype;

    @JsonProperty("supertype")
    private String supertype;

    @JsonProperty("text")
    private List<String> text;

    @JsonProperty("types")
    private List<String> types;

    @JsonProperty("weaknesses")
    private List<Weakness> weaknesses;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ability getAbility() {
        return ability;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }

    public AncientTrait getAncientTrait() {
        return ancientTrait;
    }

    public void setAncientTrait(AncientTrait ancientTrait) {
        this.ancientTrait = ancientTrait;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public List<Attack> getAttacks() {
        return attacks;
    }

    public void setAttacks(List<Attack> attacks) {
        this.attacks = attacks;
    }

    public String getEvolvesFrom() {
        return evolvesFrom;
    }

    public void setEvolvesFrom(String evolvesFrom) {
        this.evolvesFrom = evolvesFrom;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getImageUrlHiRes() {
        return imageUrlHiRes;
    }

    public void setImageUrlHiRes(String imageUrlHiRes) {
        this.imageUrlHiRes = imageUrlHiRes;
    }

    public Integer getNationalPokedexNumber() {
        return nationalPokedexNumber;
    }

    public void setNationalPokedexNumber(Integer nationalPokedexNumber) {
        this.nationalPokedexNumber = nationalPokedexNumber;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public List<Resistance> getResistances() {
        return resistances;
    }

    public void setResistances(List<Resistance> resistances) {
        this.resistances = resistances;
    }

    public List<String> getRetreatCost() {
        return retreatCost;
    }

    public void setRetreatCost(List<String> retreatCost) {
        this.retreatCost = retreatCost;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getSet() {
        return set;
    }

    public void setSet(String set) {
        this.set = set;
    }

    public String getSetCode() {
        return setCode;
    }

    public void setSetCode(String setCode) {
        this.setCode = setCode;
    }

    public String getSubtype() {
        return subtype;
    }

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    public String getSupertype() {
        return supertype;
    }

    public void setSupertype(String supertype) {
        this.supertype = supertype;
    }

    public List<String> getText() {
        return text;
    }

    public void setText(List<String> text) {
        this.text = text;
    }

    public List<String> getTypes() {
        return types;
    }

    public void setTypes(List<String> types) {
        this.types = types;
    }

    public List<Weakness> getWeaknesses() {
        return weaknesses;
    }

    public void setWeaknesses(List<Weakness> weaknesses) {
        this.weaknesses = weaknesses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Card card = (Card) o;

        if (id != null ? !id.equals(card.id) : card.id != null) return false;
        if (name != null ? !name.equals(card.name) : card.name != null) return false;
        if (ability != null ? !ability.equals(card.ability) : card.ability != null) return false;
        if (ancientTrait != null ? !ancientTrait.equals(card.ancientTrait) : card.ancientTrait != null) return false;
        if (artist != null ? !artist.equals(card.artist) : card.artist != null) return false;
        if (attacks != null ? !attacks.equals(card.attacks) : card.attacks != null) return false;
        if (evolvesFrom != null ? !evolvesFrom.equals(card.evolvesFrom) : card.evolvesFrom != null) return false;
        if (hp != null ? !hp.equals(card.hp) : card.hp != null) return false;
        if (imageUrl != null ? !imageUrl.equals(card.imageUrl) : card.imageUrl != null) return false;
        if (imageUrlHiRes != null ? !imageUrlHiRes.equals(card.imageUrlHiRes) : card.imageUrlHiRes != null)
            return false;
        if (nationalPokedexNumber != null ? !nationalPokedexNumber.equals(card.nationalPokedexNumber) : card.nationalPokedexNumber != null)
            return false;
        if (number != null ? !number.equals(card.number) : card.number != null) return false;
        if (rarity != null ? !rarity.equals(card.rarity) : card.rarity != null) return false;
        if (resistances != null ? !resistances.equals(card.resistances) : card.resistances != null) return false;
        if (retreatCost != null ? !retreatCost.equals(card.retreatCost) : card.retreatCost != null) return false;
        if (series != null ? !series.equals(card.series) : card.series != null) return false;
        if (set != null ? !set.equals(card.set) : card.set != null) return false;
        if (setCode != null ? !setCode.equals(card.setCode) : card.setCode != null) return false;
        if (subtype != null ? !subtype.equals(card.subtype) : card.subtype != null) return false;
        if (supertype != null ? !supertype.equals(card.supertype) : card.supertype != null) return false;
        if (text != null ? !text.equals(card.text) : card.text != null) return false;
        if (types != null ? !types.equals(card.types) : card.types != null) return false;
        return weaknesses != null ? weaknesses.equals(card.weaknesses) : card.weaknesses == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (ability != null ? ability.hashCode() : 0);
        result = 31 * result + (ancientTrait != null ? ancientTrait.hashCode() : 0);
        result = 31 * result + (artist != null ? artist.hashCode() : 0);
        result = 31 * result + (attacks != null ? attacks.hashCode() : 0);
        result = 31 * result + (evolvesFrom != null ? evolvesFrom.hashCode() : 0);
        result = 31 * result + (hp != null ? hp.hashCode() : 0);
        result = 31 * result + (imageUrl != null ? imageUrl.hashCode() : 0);
        result = 31 * result + (imageUrlHiRes != null ? imageUrlHiRes.hashCode() : 0);
        result = 31 * result + (nationalPokedexNumber != null ? nationalPokedexNumber.hashCode() : 0);
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + (rarity != null ? rarity.hashCode() : 0);
        result = 31 * result + (resistances != null ? resistances.hashCode() : 0);
        result = 31 * result + (retreatCost != null ? retreatCost.hashCode() : 0);
        result = 31 * result + (series != null ? series.hashCode() : 0);
        result = 31 * result + (set != null ? set.hashCode() : 0);
        result = 31 * result + (setCode != null ? setCode.hashCode() : 0);
        result = 31 * result + (subtype != null ? subtype.hashCode() : 0);
        result = 31 * result + (supertype != null ? supertype.hashCode() : 0);
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (types != null ? types.hashCode() : 0);
        result = 31 * result + (weaknesses != null ? weaknesses.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        try {
            return MAPPER.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            return "";
        }
    }
}
