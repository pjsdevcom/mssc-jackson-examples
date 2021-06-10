package com.pjsdev.msscjacksonexamples.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import static org.junit.jupiter.api.Assertions.*;

@JsonTest
class BeerDtoTest extends BaseTest {

    @Test
    void testSerializeDto() throws JsonProcessingException {
        BeerDto beerDto = getDto();

        String jsonString = objectMapper.writeValueAsString(beerDto);

        System.out.println(jsonString);
    }

    @Test
    void testDeserialize() throws JsonProcessingException {
        String json = "{\"beerName\":\"Top Bloke\",\"beerStyle\":\"Ale\",\"upc\":123789456321,\"price\":\"3.99\",\"createdDate\":\"2021-06-10T09:35:12+0100\",\"lastUpdatedDate\":\"2021-06-10T09:35:12.644871+01:00\",\"myLocalDate\":\"20210610\",\"beerId\":\"0b174d9e-699c-430c-9748-2c7fffa89c2a\"}";

        BeerDto beerDto = objectMapper.readValue(json, BeerDto.class);

        System.out.println(beerDto);
    }
}