package br.com.desafio.petchopservice.service.animal;

import br.com.desafio.petchopservice.dao.AnimalDAO;
import br.com.desafio.petchopservice.model.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class IAnimal implements IAnimalService {
    @Autowired
    private AnimalDAO dao;

    @Override
    public Animal criarNovoAnimal(Animal novo) {
        if (novo.getNome_animal() != null && novo.getIdade_animal() != null && novo.getPeso_animal() != null && novo.getCliente() != null) {
            return dao.save(novo);
        }
        return null;
    }

    @Override
    public Animal atualizarDadosAnimal(Animal dados) {
        if (dados.getId_animal() != null && dados.getNome_animal() != null && dados.getIdade_animal() != null && dados.getPeso_animal() != null && dados.getCliente() != null) {
            return dao.save(dados);
        }
        return null;
    }

    @Override
    public ArrayList<Animal> buscarTodosAnimais() {
        return (ArrayList<Animal>)dao.findAll();
    }

    @Override
    public Animal buscarPeloIdAnimal(Integer id) {
        return dao.findById(id).orElse(null);
    }

    @Override
    public void excluirAnimal(Integer id) {
        dao.deleteById(id);
    }

}
