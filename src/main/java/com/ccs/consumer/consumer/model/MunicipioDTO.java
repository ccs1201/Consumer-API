package com.ccs.consumer.consumer.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class MunicipioDTO {

    private Integer id;

    private String nome;

    private EstadoDTO estado;
}
