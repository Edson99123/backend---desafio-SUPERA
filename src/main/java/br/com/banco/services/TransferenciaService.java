package br.com.banco.services;


import br.com.banco.entities.Transferencia;
import br.com.banco.repositories.TrasnferenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class TransferenciaService {

    @Autowired
    private TrasnferenciaRepository repository;

    public List<Transferencia> findAll(){
        return repository.findAll();
    }

    public List<Transferencia> findByIdConta(Long contaId) {
        return repository.findByContaId(contaId);
    }

    public List<Transferencia> findOperadorTransacao(String operadorTransacao) {
        return  repository.findByOperadorTransacao(operadorTransacao);
    }

    public List<Transferencia> buscaPorPeiodoDeDatas(LocalDateTime dateInicio, LocalDateTime dateFim) {
        return  repository.buscaPorPeriodoDeDatas(dateInicio, dateFim);
    }
}
