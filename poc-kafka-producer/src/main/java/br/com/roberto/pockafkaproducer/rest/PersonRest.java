package br.com.roberto.pockafkaproducer.rest;

import br.com.roberto.pockafkaproducer.schema.Person;
import br.com.roberto.pockafkaproducer.service.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/persons")
public class PersonRest {

    @Autowired
    private Producer producer;

    @PostMapping(value = "/publish")
    public ResponseEntity<?> sendMessageToKafkaTopic(@RequestBody Person person) {
        producer.send(person);
        return ResponseEntity.accepted().build();
    }

}
