package br.com.desafio.petchopservice.dao;

import br.com.desafio.petchopservice.model.OrdemServico;
import org.springframework.data.repository.CrudRepository;

public interface OrdemServicoDAO extends CrudRepository<OrdemServico, Integer> {
}
