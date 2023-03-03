package com.ccs.consumer.consumer.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EnderecoDTO {

    private String logradouro;
    private String numero;
    private String complemento;
    private String bairro;
    private String cep;
    private MunicipioDTO municipio;
}
