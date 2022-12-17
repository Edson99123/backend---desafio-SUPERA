package br.com.banco.repositories;

import br.com.banco.entities.Transferencia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TrasnferenciaRepository extends JpaRepository<Transferencia, Long> {


   public List<Transferencia> findByContaId(Long contaId);

   public List<Transferencia> findByTipo(String tipo);

//   public List<Transferencia> findByTipo(String tipo);
}
