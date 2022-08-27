package br.com.desafio.petchopservice.controller;

import br.com.desafio.petchopservice.model.Animal;
import br.com.desafio.petchopservice.service.animal.IAnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class AnimalController {

    @Autowired
    private IAnimalService service;

    @GetMapping("/animais")
    public ArrayList<Animal> recuperarTodos() {
        return service.buscarTodosAnimais();
    }

    @GetMapping("/animais/{id_animal}")
    public ResponseEntity<Animal> buscarPeloId(@PathVariable int id_animal) {
        Animal res = service.buscarPeloIdAnimal(id_animal);
        if (res != null) {
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping("/animais")
    public ResponseEntity<Animal> incluirNovo(@RequestBody Animal novo) {
        Animal res = service.criarNovoAnimal(novo);
        if (res != null) {
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.badRequest().build();
    }

    @PutMapping("/animais")
    public ResponseEntity<Animal> alterar(@RequestBody Animal dados) {
        Animal res = service.atualizarDadosAnimal(dados);
        if (res != null) {
            return ResponseEntity.ok(res);
        }
        return ResponseEntity.badRequest().build();
    }

    @DeleteMapping("/animais/{id_animal}")
    public ResponseEntity<Animal> excluir(@PathVariable Integer id_animal) {
        service.excluirAnimal(id_animal);
        return ResponseEntity.ok(null);
    }

}

