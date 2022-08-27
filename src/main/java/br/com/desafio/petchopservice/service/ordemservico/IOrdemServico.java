package br.com.desafio.petchopservice.service.ordemservico;

import br.com.desafio.petchopservice.dao.OrdemServicoDAO;
import br.com.desafio.petchopservice.model.OrdemServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class IOrdemServico implements IOrdemServicoService{
    @Autowired
    private OrdemServicoDAO dao;

    @Override
    public OrdemServico criarNovoOrdemServico(OrdemServico novo) {
        if (novo.getCliente() != null && novo.getValor_servico() != null && novo.getHora_entrada() != null && novo.getHora_saida() != null) {
            return dao.save(novo);
        }
        return null;
    }

    @Override
    public OrdemServico atualizarDadosOrdemServico(OrdemServico dados) {
        if (dados.getId_ordem_servico() != null && dados.getCliente() != null && dados.getValor_servico() != null && dados.getHora_entrada() != null && dados.getHora_saida() != null) {
            return dao.save(dados);
        }
        return null;
    }

    @Override
    public ArrayList<OrdemServico> buscarTodosOrdemServico() {
        return (ArrayList<OrdemServico>)dao.findAll();
    }

    @Override
    public OrdemServico buscarPeloIdOrdemServico(Integer id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    public void excluirOrdemServico(Integer id) {
        dao.deleteById(id);
    }

}
