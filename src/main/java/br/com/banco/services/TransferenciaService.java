package br.com.banco.services;


import br.com.banco.entities.Transferencia;
import br.com.banco.repositories.TrasnferenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TransferenciaService {

    @Autowired
    private TrasnferenciaRepository repository;

    public Transferencia findByIdConta(Long idConta) {
        Optional<Transferencia> transferencia = repository.findById(idConta);
        return transferencia.get();
    }

}
