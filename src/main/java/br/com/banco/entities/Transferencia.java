package br.com.banco.entities;

import javax.persistence.*;
import java.security.Timestamp;

@Entity
@Table(name = "transferencia")
public class Transferencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id ")
    private Long idTransferencia;

    @Column(name = "data_transferencia")
    private Timestamp dataTransferencia;


    private Double valor;

    private String tipo;

    @Column(name = "nome_operador_transacao")
    private String operadorTransacao;

    @ManyToOne
    private Conta conta;

    /**
     * Constructors*/
    public Transferencia(){
    }

    public Transferencia(Long idTransferencia, Timestamp dataTransferencia, Double valor, String tipo, String operadorTransacao, Conta conta) {
        this.idTransferencia = idTransferencia;
        this.dataTransferencia = dataTransferencia;
        this.valor = valor;
        this.tipo = tipo;
        this.operadorTransacao = operadorTransacao;
        this.conta = conta;
    }

    /**
     * Getters and Setters*/
    public Long getIdTransferencia() {
        return idTransferencia;
    }

    public void setIdTransferencia(Long idTransferencia) {
        this.idTransferencia = idTransferencia;
    }

    public Timestamp getDataTransferencia() {
        return dataTransferencia;
    }

    public void setDataTransferencia(Timestamp dataTransferencia) {
        this.dataTransferencia = dataTransferencia;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getOperadorTransacao() {
        return operadorTransacao;
    }

    public void setOperadorTransacao(String operadorTransacao) {
        this.operadorTransacao = operadorTransacao;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
}
