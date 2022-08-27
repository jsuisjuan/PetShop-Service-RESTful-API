package br.com.desafio.petchopservice.dao;

import br.com.desafio.petchopservice.model.Animal;
import org.springframework.data.repository.CrudRepository;

public interface AnimalDAO extends CrudRepository<Animal, Integer> {
}
