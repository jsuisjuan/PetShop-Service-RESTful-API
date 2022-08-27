package br.com.desafio.petchopservice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "animal")
public class Animal {

    @Column(name = "id_animal")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_animal;

    @Column(name = "nome_animal", length = 50, nullable = false)
    private String nome_animal;

    @Column(name = "idade_animal", nullable = false)
    private Integer idade_animal;

    @Column(name = "peso_animal", nullable = false)
    private Double peso_animal;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    @JsonIgnoreProperties("listaAnimal")
    private Cliente cliente;

    public Integer getId_animal() {
        return id_animal;
    }

    public void setId_animal(Integer id_animal) {
        this.id_animal = id_animal;
    }

    public String getNome_animal() {
        return nome_animal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setNome_animal(String nome_animal) {
        this.nome_animal = nome_animal;
    }

    public Integer getIdade_animal() {
        return idade_animal;
    }

    public void setIdade_animal(Integer idade_animal) {
        this.idade_animal = idade_animal;
    }

    public Double getPeso_animal() {
        return peso_animal;
    }

    public void setPeso_animal(Double peso_animal) {
        this.peso_animal = peso_animal;
    }

}
