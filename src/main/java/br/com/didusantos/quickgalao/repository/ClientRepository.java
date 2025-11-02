package br.com.didusantos.quickgalao.repository;

import br.com.didusantos.quickgalao.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRepository extends JpaRepository<Client, Integer> {

    Optional<Client> findByName(String name);

    Optional<Client> findById(Integer id);

    Optional<Client> findByAddress(String address);

    Optional<Client> findByPhoneNumber(String phoneNumber);

    Optional<Client> findByEmail(String email);

}
