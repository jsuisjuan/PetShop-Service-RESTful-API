package br.com.desafio.petchopservice.model;

import javax.persistence.*;

@Entity
@Table(name = "ordem_servico")
public class OrdemServico {

    @Column(name = "id_ordem_servico")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_ordem_servico;

    @Column(name = "valor_servico", nullable = false)
    private Double valor_servico;

    @Column(name = "hora_entrada", nullable = false)
    private Integer hora_entrada;

    @Column(name = "hora_saida", nullable = false)
    private Integer hora_saida;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

    public Integer getId_ordem_servico() {
        return id_ordem_servico;
    }

    public void setId_ordem_servico(Integer id_ordem_servico) {
        this.id_ordem_servico = id_ordem_servico;
    }

    public Double getValor_servico() {
        return valor_servico;
    }

    public void setValor_servico(Double valor_servico) {
        this.valor_servico = valor_servico;
    }

    public Integer getHora_entrada() {
        return hora_entrada;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setHora_entrada(Integer hora_entrada) {
        this.hora_entrada = hora_entrada;
    }

    public Integer getHora_saida() {
        return hora_saida;
    }

    public void setHora_saida(Integer hora_saida) {
        this.hora_saida = hora_saida;
    }
}
