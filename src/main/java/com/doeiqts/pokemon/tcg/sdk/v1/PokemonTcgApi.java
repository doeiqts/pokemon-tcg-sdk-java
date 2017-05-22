package com.doeiqts.pokemon.tcg.sdk.v1;

import com.doeiqts.pokemon.tcg.domain.v1.Card;
import com.doeiqts.pokemon.tcg.domain.v1.Cards;
import com.doeiqts.pokemon.tcg.domain.v1.Set;
import com.doeiqts.pokemon.tcg.domain.v1.Sets;
import com.doeiqts.pokemon.tcg.domain.v1.Subtypes;
import com.doeiqts.pokemon.tcg.domain.v1.Supertypes;
import com.doeiqts.pokemon.tcg.domain.v1.Types;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedMap;
import java.util.List;

public class PokemonTcgApi {
    private final Client client = Client.create(generateClientConfig());

    public Card getCard(String id) {
        WebResource webResource = client
                .resource("https://api.pokemontcg.io/v1/cards/" + id);

        ClientResponse response = callAPI(webResource);

        handleErrors(response);

        return response.getEntity(Card.class);
    }

    public List<Card> searchCards(MultivaluedMap<String, String> searchCriteria) {
        WebResource webResource = client
                .resource("https://api.pokemontcg.io/v1/cards")
                .queryParams(searchCriteria);

        ClientResponse response = callAPI(webResource);

        handleErrors(response);

        return response.getEntity(Cards.class);
    }

    public Set getSet(String setCode) {
        WebResource webResource = client
                .resource("https://api.pokemontcg.io/v1/sets/" + setCode);

        ClientResponse response = callAPI(webResource);

        handleErrors(response);

        return response.getEntity(Set.class);
    }

    public List<Set> getSets(MultivaluedMap<String, String> searchCriteria) {
        WebResource webResource = client
                .resource("https://api.pokemontcg.io/v1/sets")
                .queryParams(searchCriteria);

        ClientResponse response = callAPI(webResource);

        handleErrors(response);

        return response.getEntity(Sets.class);
    }

    public List<String> getTypes() {
        WebResource webResource = client
                .resource("https://api.pokemontcg.io/v1/types");

        ClientResponse response = callAPI(webResource);

        handleErrors(response);

        return response.getEntity(Types.class);
    }

    public List<String> getSupertypes() {
        WebResource webResource = client
                .resource("https://api.pokemontcg.io/v1/supertypes");

        ClientResponse response = callAPI(webResource);

        handleErrors(response);

        return response.getEntity(Supertypes.class);
    }

    public List<String> getSubtypes() {
        WebResource webResource = client
                .resource("https://api.pokemontcg.io/v1/subtypes");

        ClientResponse response = callAPI(webResource);

        handleErrors(response);

        return response.getEntity(Subtypes.class);
    }

    private ClientConfig generateClientConfig() {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, true);

        JacksonJaxbJsonProvider jacksonProvider
                = new JacksonJaxbJsonProvider(objectMapper, JacksonJaxbJsonProvider.DEFAULT_ANNOTATIONS);

        ClientConfig config = new DefaultClientConfig();
        config.getSingletons().add(jacksonProvider);

        return config;
    }

    private ClientResponse callAPI(WebResource webResource) {
        return webResource
                .accept("application/json")
                .header(HttpHeaders.USER_AGENT, "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_10_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2227.1 Safari/537.36")
                .get(ClientResponse.class);
    }

    private void handleErrors(ClientResponse response) {
        if (response.getStatus() != 200) {
            String output = response.getEntity(String.class);

            System.out.println("Output from Server .... \n");
            System.out.println(output);

            throw new RuntimeException("Failed : HTTP error code : "
                    + response.getStatus());
        }
    }

}
