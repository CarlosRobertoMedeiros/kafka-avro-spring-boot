package br.com.roberto.kafkaconsumerpocwithavro.services;

import br.com.roberto.avro.UsuarioAvro;
import br.com.roberto.kafkaconsumerpocwithavro.models.Usuario;
import br.com.roberto.kafkaconsumerpocwithavro.repositories.UsuarioRepository;
import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaService {

    private final UsuarioRepository usuarioRepository;

    private  KafkaService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @KafkaListener(topics = "${kafka.topic.consumer.name}",groupId = "topic-usuario-2")
    public void consumer(ConsumerRecord<String, UsuarioAvro> userAvro){
        Usuario usuario = new Usuario();
        UsuarioAvro usuarioAvro = userAvro.value();
        usuario.setNome(usuarioAvro.getNome());
        usuario.setEndereco(usuarioAvro.getEndereco());
        usuario.setIdade(usuarioAvro.getIdade());
        usuarioRepository.save(usuario);
        log.info("{}",usuario);
    }

}
