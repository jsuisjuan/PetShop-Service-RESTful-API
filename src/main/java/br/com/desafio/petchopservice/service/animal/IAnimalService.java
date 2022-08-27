package br.com.desafio.petchopservice.service.animal;

import br.com.desafio.petchopservice.model.Animal;

import java.util.ArrayList;

public interface IAnimalService {
    public Animal criarNovoAnimal(Animal novo);
    public Animal atualizarDadosAnimal(Animal dados);
    public ArrayList<Animal> buscarTodosAnimais();
    public Animal buscarPeloIdAnimal(Integer id);
    public void excluirAnimal(Integer id);
}
