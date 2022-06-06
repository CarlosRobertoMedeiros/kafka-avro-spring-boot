package br.com.roberto.kafkaproducerpocwithavro.dto;

import lombok.Data;

@Data
public class UsuarioDto {
    private String nome;
    private String endereco;
    private Short idade;
}
