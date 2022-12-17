package br.com.banco.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "transferencia")
public class Transferencia implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long idTransferencia;

    @Column(name = "data_transferencia")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataTransferencia;

    private Double valor;

    private String tipo;

    @Column(name = "nome_operador_transacao")
    private String operadorTransacao;


    @Column(name = "conta_id")
    private Long contaId;

    /**
     * Constructors*/
    public Transferencia(){
    }

    public Transferencia(Long idTransferencia, Date dataTransferencia, Double valor, String tipo, String operadorTransacao, Long contaId) {
        this.idTransferencia = idTransferencia;
        this.dataTransferencia = dataTransferencia;
        this.valor = valor;
        this.tipo = tipo;
        this.operadorTransacao = operadorTransacao;
        this.contaId = contaId;
    }
}
