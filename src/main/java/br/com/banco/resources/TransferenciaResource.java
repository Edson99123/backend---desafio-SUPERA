package br.com.banco.resources;

import br.com.banco.entities.Transferencia;
import br.com.banco.repositories.TrasnferenciaRepository;
import br.com.banco.services.TransferenciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/operacao")
public class TransferenciaResource {

    @Autowired
    private TransferenciaService service;


    /**
     * A sua api deve fornecer os dados de transferência de acordo com o número da conta bacária.*/
    @GetMapping(value = "/{idConta}")
    public ResponseEntity<Transferencia> findByIdConta(@PathVariable Long idConta){
        Transferencia transferencia = service.findByIdConta(idConta);
        return ResponseEntity.ok().body(transferencia);
    }
}
