package io.github.Peh099.clientes.model.repository;

import io.github.Peh099.clientes.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
    Optional<Usuario> findByUsername(String username);

    //select count(*) > from usuario where username=:login
    boolean existsByUsername(String username);
}
