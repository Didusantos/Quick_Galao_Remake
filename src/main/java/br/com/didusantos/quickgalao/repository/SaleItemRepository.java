package br.com.didusantos.quickgalao.repository;

import br.com.didusantos.quickgalao.model.SaleItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SaleItemRepository extends JpaRepository<SaleItem, Integer> {

    Optional<SaleItem> findBySaleId(int productId);

    Optional<SaleItem> findByProductId(int productId);

    Optional<SaleItem> findByClientId(int clientId);

    Optional<SaleItem> findByClientIdAndProductId(int clientId, int productId);

    Optional<SaleItem> findByRegistrationUnitPriceStartingWithAndRegistrationUnitPriceEndingWith(int priceStartingWith, int priceEndingWith);

}
