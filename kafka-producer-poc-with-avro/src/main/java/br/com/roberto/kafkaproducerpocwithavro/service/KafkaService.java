package br.com.roberto.kafkaproducerpocwithavro.service;

import br.com.roberto.avro.UsuarioAvro;
import br.com.roberto.kafkaproducerpocwithavro.dto.UsuarioDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaService {

    @Value("${topic.name.producer}")
    private String topico;

    private final KafkaTemplate<String, UsuarioAvro> kafkaTemplate;

    public KafkaService(KafkaTemplate<String, UsuarioAvro> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void producer(UsuarioDto usuarioDTO) {
        UsuarioAvro userAvro = UsuarioAvro.newBuilder()
                .setNome(usuarioDTO.getNome())
                .setIdade(usuarioDTO.getIdade())
                .setEndereco(usuarioDTO.getEndereco())
                .build();
        kafkaTemplate.send(topico, userAvro);
        log.info("{}", userAvro);
    }


}
