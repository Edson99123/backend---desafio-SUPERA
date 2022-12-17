package br.com.banco.resources;

import br.com.banco.entities.Conta;
import br.com.banco.entities.Transferencia;
import br.com.banco.services.TransferenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping(value = "/operacao")
public class TransferenciaResource {

    @Autowired
    private TransferenciaService service;

    /**
     * A sua api deve fornecer os dados de transferência de acordo com o número da conta bacária.*/
    @GetMapping
    public ResponseEntity<List<Transferencia>> findAll(){
        List<Transferencia> transferenciaLista = service.findAll();
        return ResponseEntity.ok().body(transferenciaLista);
    }

    /**
     * A sua api deve fornecer os dados de transferência de acordo com o número da conta bacária.*/
    @GetMapping(value = "/{contaId}")
    public ResponseEntity<List<Transferencia>> findByIdConta(@PathVariable Long contaId){
        List<Transferencia> transferencias = service.findByIdConta(contaId);
        return ResponseEntity.ok().body(transferencias);
    }

    /**
     * Caso seja informado o nome do operador da transação, retornar todas as transferências relacionados à aquele operador.*/
    @GetMapping(value = "/operador/{operadorTransacao}")
    public ResponseEntity<List<Transferencia>> findByoperador(@PathVariable String operadorTransacao){
        List<Transferencia> transferencias = service.findOperadorTransacao(operadorTransacao);
        return ResponseEntity.ok().body(transferencias);
    }
    

    /**
     * por datas de inicio e fim*/
    @GetMapping(value = "/periodo/{dataInicio},{dataFim}")
    public ResponseEntity<List<Transferencia>> findTipoOperacao(@PathVariable LocalDateTime dataInicio, @PathVariable LocalDateTime dataFim){
        List<Transferencia> transferencias = service.buscaPorPeiodoDeDatas(dataInicio, dataFim);
        return ResponseEntity.ok().body(transferencias);
    }

}
