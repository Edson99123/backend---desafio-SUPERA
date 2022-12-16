package br.com.banco.repositories;

import br.com.banco.entities.Conta;
import br.com.banco.entities.Transferencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrasnferenciaRepository extends JpaRepository<Transferencia, Long> {

}
