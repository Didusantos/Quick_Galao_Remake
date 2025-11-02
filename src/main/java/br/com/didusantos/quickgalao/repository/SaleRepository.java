package br.com.didusantos.quickgalao.repository;

import br.com.didusantos.quickgalao.model.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.Optional;

public interface SaleRepository extends JpaRepository<Sale, Integer> {
    Optional<Sale> findById(int id);

    Optional<Sale> findByClientId(int clientId);

    Optional<Sale> findByDate(Date date);

    Optional<Sale> findByStatus(String status);

    Optional<Sale> findByTotalStartingWithAndTotalEndingWith(int totalStartingWith, int totalEndingWith);

}
