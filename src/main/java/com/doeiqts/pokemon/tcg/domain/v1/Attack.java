package com.doeiqts.pokemon.tcg.domain.v1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Attack implements Serializable {
    private static final ObjectMapper MAPPER = new ObjectMapper();

    @JsonProperty("convertedEnergyCost")
    private Integer convertedEnergyCost;

    @JsonProperty("cost")
    private List<String> cost;

    @JsonProperty("damage")
    private String damage;

    @JsonProperty("name")
    private String name;

    @JsonProperty("text")
    private String text;

    public Integer getConvertedEnergyCost() {
        return convertedEnergyCost;
    }

    public void setConvertedEnergyCost(Integer convertedEnergyCost) {
        this.convertedEnergyCost = convertedEnergyCost;
    }

    public List<String> getCost() {
        return cost;
    }

    public void setCost(List<String> cost) {
        this.cost = cost;
    }

    public String getDamage() {
        return damage;
    }

    public void setDamage(String damage) {
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Attack attack = (Attack) o;

        if (convertedEnergyCost != null ? !convertedEnergyCost.equals(attack.convertedEnergyCost) : attack.convertedEnergyCost != null)
            return false;
        if (cost != null ? !cost.equals(attack.cost) : attack.cost != null) return false;
        if (damage != null ? !damage.equals(attack.damage) : attack.damage != null) return false;
        if (name != null ? !name.equals(attack.name) : attack.name != null) return false;
        return text != null ? text.equals(attack.text) : attack.text == null;

    }

    @Override
    public int hashCode() {
        int result = convertedEnergyCost != null ? convertedEnergyCost.hashCode() : 0;
        result = 31 * result + (cost != null ? cost.hashCode() : 0);
        result = 31 * result + (damage != null ? damage.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (text != null ? text.hashCode() : 0);
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
