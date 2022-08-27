package br.com.desafio.petchopservice.service.cliente;

import br.com.desafio.petchopservice.dao.ClienteDAO;
import br.com.desafio.petchopservice.model.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ICliente implements IClienteService {
    @Autowired
    private ClienteDAO dao;

    @Override
    public Cliente criarNovoCliente(Cliente novo) {
        if (novo.getNome_cliente() != null && novo.getTelefone_cliente() != null) {
            return dao.save(novo);
        }
        return null;
    }

    @Override
    public Cliente atualizarDadosCliente(Cliente dados) {
        if (dados.getId_cliente() != null && dados.getNome_cliente() != null && dados.getTelefone_cliente() != null) {
            return dao.save(dados);
        }
        return null;
    }

    @Override
    public ArrayList<Cliente> buscarTodosClientes() {
        return (ArrayList<Cliente>)dao.findAll();
    }

    @Override
    public Cliente buscarPeloIdCliente(Integer id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    public void excluirCliente(Integer id) {
        dao.deleteById(id);
    }

}
