package com.doeiqts.pokemon.tcg.domain.v1;

import com.fasterxml.jackson.annotation.JsonRootName;

import java.io.Serializable;
import java.util.ArrayList;

@JsonRootName(value = "sets")
public class Sets extends ArrayList<Set> implements Serializable {

}
