package io.github.Peh099.clientes.model.repository;

import io.github.Peh099.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository <Cliente,Integer>{

}
