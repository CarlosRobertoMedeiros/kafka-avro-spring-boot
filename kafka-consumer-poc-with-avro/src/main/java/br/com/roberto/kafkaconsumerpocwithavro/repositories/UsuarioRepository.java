package br.com.roberto.kafkaconsumerpocwithavro.repositories;

import br.com.roberto.kafkaconsumerpocwithavro.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UsuarioRepository extends JpaRepository<Usuario, UUID> {
}
