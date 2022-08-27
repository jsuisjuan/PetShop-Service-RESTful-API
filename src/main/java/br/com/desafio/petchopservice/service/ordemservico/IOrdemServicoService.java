package br.com.desafio.petchopservice.service.ordemservico;

import br.com.desafio.petchopservice.model.OrdemServico;

import java.util.ArrayList;

public interface IOrdemServicoService {
    public OrdemServico criarNovoOrdemServico(OrdemServico novo);
    public OrdemServico atualizarDadosOrdemServico(OrdemServico dados);
    public ArrayList<OrdemServico> buscarTodosOrdemServico();
    public OrdemServico buscarPeloIdOrdemServico(Integer id);
    public void excluirOrdemServico(Integer id);
}
