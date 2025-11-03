package br.com.didusantos.quickgalao.repository;

import br.com.didusantos.quickgalao.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    Optional<Product> findByName(String name);

    Optional<Product> findById(Integer id);

}
