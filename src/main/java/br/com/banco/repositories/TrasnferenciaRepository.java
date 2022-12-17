package br.com.banco.repositories;

import br.com.banco.entities.Transferencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public interface TrasnferenciaRepository extends JpaRepository<Transferencia, Long> {


   public List<Transferencia> findByContaId(Long contaId);

   public List<Transferencia> findByOperadorTransacao(String operadorTransacao);

   @Query(value="select * from Transferencia tr where tr.data_transferencia >= :dataInicio And tr.data_transferencia <= :dataFim", nativeQuery=true)
   public List<Transferencia> buscaPorPeriodoDeDatas(LocalDateTime dataInicio, LocalDateTime dataFim);

}
