package br.com.desafio.petchopservice.dao;

import br.com.desafio.petchopservice.model.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteDAO extends CrudRepository<Cliente, Integer> {
}
