package com.dh.clinica.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Usuario {

    private Integer id;
    private String nome;
    private String email;
    private String senha;
    private String nivelAcesso;


}
