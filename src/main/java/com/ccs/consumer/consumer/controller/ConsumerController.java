package com.ccs.consumer.consumer.controller;

import com.ccs.consumer.consumer.model.RestauranteDTO;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api/consumer")
@AllArgsConstructor
public class ConsumerController {

    private final String URL = "http://localhost:8080/api/restaurantes/";

    private RestTemplate restTemplate;

    @GetMapping("/{id}")
    public RestauranteDTO get(@PathVariable Long id) {

        Logger.getLogger("Consumer API").log(Level.INFO,"Entrou no GET do Consumer API");

        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Basic ZGV2OjEyMzQ=");

        HttpEntity<Void> requestEntity = new HttpEntity<>(headers);

        RestauranteDTO restauranteDTO;

        restauranteDTO = restTemplate.exchange(URL + id, HttpMethod.GET, requestEntity, RestauranteDTO.class).getBody();

        return restauranteDTO;
    }
}
