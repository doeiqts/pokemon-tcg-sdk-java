package com.doeiqts.pokemon.tcg.domain.v1;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonRootName(value = "set")
public class Set implements Serializable {
    private static final ObjectMapper MAPPER = new ObjectMapper();

    @JsonProperty("code")
    private String code;

    @JsonProperty("name")
    private String name;

    @JsonProperty("expandedLegal")
    private Boolean expandedLegal;

    @JsonProperty("releaseDate")
    private String releaseDate;

    @JsonProperty("series")
    private String series;

    @JsonProperty("standardLegal")
    private Boolean standardLegal;

    @JsonProperty("totalCards")
    private Integer totalCards;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getExpandedLegal() {
        return expandedLegal;
    }

    public void setExpandedLegal(Boolean expandedLegal) {
        this.expandedLegal = expandedLegal;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public Boolean getStandardLegal() {
        return standardLegal;
    }

    public void setStandardLegal(Boolean standardLegal) {
        this.standardLegal = standardLegal;
    }

    public Integer getTotalCards() {
        return totalCards;
    }

    public void setTotalCards(Integer totalCards) {
        this.totalCards = totalCards;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Set set = (Set) o;

        if (code != null ? !code.equals(set.code) : set.code != null) return false;
        if (name != null ? !name.equals(set.name) : set.name != null) return false;
        if (expandedLegal != null ? !expandedLegal.equals(set.expandedLegal) : set.expandedLegal != null) return false;
        if (releaseDate != null ? !releaseDate.equals(set.releaseDate) : set.releaseDate != null) return false;
        if (series != null ? !series.equals(set.series) : set.series != null) return false;
        if (standardLegal != null ? !standardLegal.equals(set.standardLegal) : set.standardLegal != null) return false;
        return totalCards != null ? totalCards.equals(set.totalCards) : set.totalCards == null;

    }

    @Override
    public int hashCode() {
        int result = code != null ? code.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (expandedLegal != null ? expandedLegal.hashCode() : 0);
        result = 31 * result + (releaseDate != null ? releaseDate.hashCode() : 0);
        result = 31 * result + (series != null ? series.hashCode() : 0);
        result = 31 * result + (standardLegal != null ? standardLegal.hashCode() : 0);
        result = 31 * result + (totalCards != null ? totalCards.hashCode() : 0);
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
