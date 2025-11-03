package br.com.didusantos.quickgalao.repository;

import br.com.didusantos.quickgalao.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface ClientRepository extends JpaRepository<Client, UUID> {

    Optional<Client> findByName(String name);

    Optional<Client> findByAddress(String address);

    Optional<Client> findByPhoneNumber(String phoneNumber);

}
