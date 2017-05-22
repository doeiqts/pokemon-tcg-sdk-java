package com.doeiqts.pokemon.tcg.domain.v1;

import com.fasterxml.jackson.annotation.JsonRootName;

import java.io.Serializable;
import java.util.ArrayList;

@JsonRootName(value = "subtypes")
public class Subtypes extends ArrayList<String> implements Serializable {

}