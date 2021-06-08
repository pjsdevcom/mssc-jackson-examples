package com.pjsdev.msscjacksonexamples.model;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.UUID;

@JsonTest
public class BaseTest {

    @Autowired
    ObjectMapper objectMapper;

    BeerDto getDto() {
        return BeerDto.builder()
                .beerName("Top Bloke")
                .beerStyle("Ale")
                .id(UUID.randomUUID())
                .createdDate(OffsetDateTime.now())
                .lastUpdatedDate(OffsetDateTime.now())
                .price(new BigDecimal("3.99"))
                .upc(123789456321L)
                .build();
    }
}
