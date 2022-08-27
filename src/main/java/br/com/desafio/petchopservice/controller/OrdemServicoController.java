package br.com.desafio.petchopservice.controller;

import br.com.desafio.petchopservice.model.OrdemServico;
import br.com.desafio.petchopservice.service.ordemservico.IOrdemServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;

@RestController
public class OrdemServicoController {

    @Autowired
    private IOrdemServicoService service;

    @GetMapping("/ordemservicos")
    public ArrayList<OrdemServico> recuperarTodos() {
        return service.buscarTodosOrdemServico();
    }

    @GetMapping("/ordemservicos/{id_ordem_servico}")
    public ResponseEntity<OrdemServico> buscarPeloId(@PathVariable Integer id_ordem_servico) {
        OrdemServico res = service.buscarPeloIdOrdemServico(id_ordem_servico);
        if (res != null) {
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/ordemservicos")
    public ResponseEntity<OrdemServico> incluirNovo(@RequestBody OrdemServico novo) {
        OrdemServico res = service.criarNovoOrdemServico(novo);
        if (res != null) {
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.badRequest().build();
    }

    @PutMapping("/ordemservicos")
    public ResponseEntity<OrdemServico> alterar(@RequestBody OrdemServico dados) {
        OrdemServico res = service.atualizarDadosOrdemServico(dados);
        if (res != null) {
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/ordemservicos/{id_ordem_servico}")
    public ResponseEntity<OrdemServico> excluir(@PathVariable Integer id_ordem_servico) {
        service.excluirOrdemServico(id_ordem_servico);
        return ResponseEntity.ok(null);
    }

}

