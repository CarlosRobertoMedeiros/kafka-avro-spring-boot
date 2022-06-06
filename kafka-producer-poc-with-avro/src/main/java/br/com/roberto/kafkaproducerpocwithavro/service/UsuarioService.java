package br.com.roberto.kafkaproducerpocwithavro.service;

import br.com.roberto.kafkaproducerpocwithavro.dto.UsuarioDto;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final KafkaService kafkaService;

    public UsuarioService(KafkaService kafkaService) {
        this.kafkaService = kafkaService;
    }

    public UsuarioDto enviar(UsuarioDto usuarioDto) {
        kafkaService.producer(usuarioDto);
        return usuarioDto;
    }

}
