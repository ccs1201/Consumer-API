package com.ccs.consumer.consumer.model;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class RestauranteDTO {

    private String consumer = "Consumer API";
    private Long id;
    private String nome;
    private BigDecimal taxaEntrega;
    private boolean ativo;
    private boolean aberto;
    private CozinhaDTO cozinha;
    private EnderecoDTO endereco;
}
