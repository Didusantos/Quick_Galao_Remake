package br.com.didusantos.quickgalao.repository;

import br.com.didusantos.quickgalao.model.Client;
import com.github.javafaker.Faker;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

// Está classe está usando a biblioteca do Faker para testar e verificar os endpoints da aplicação estão Ok.
@Component
public class FakeClientRepository {

    Faker faker = new Faker();

    private List<Client> internalState = new LinkedList<>();

    public FakeClientRepository() {
        for (int i = 0; i < 100; i++) {
            Client client = new Client(UUID.randomUUID(),
                    faker.name().fullName(),
                    faker.address().fullAddress(),
                    faker.phoneNumber().cellPhone()
            );
            this.internalState.add(client);
        }
    }

    public List<Client> findAll() {
        return this.internalState.stream().toList();
    }

    public Client findById(UUID id) {
        for (Client client : this.internalState) {
            if (client.getId().equals(id)) {
                return client;
            }
        }
        return null;
    }

    public List<Client> findByName(String name) {
        return this.internalState.stream().filter(client -> client.getName().equals(name)).toList();
    }

    public List<Client> findByAddress(String address) {
        return this.internalState.stream().filter(client -> client.getAddress().equals(address)).toList();
    }

    public List<Client> findByPhoneNumber(String phoneNumber) {
        return this.internalState.stream().filter(client -> client.getPhoneNumber().equals(phoneNumber)).toList();
    }

    public void removeById(UUID id) {
        this.internalState.removeIf(client -> client.getId().equals(id));
    }

    public Client create(Client client) {
        this.internalState.add(client);
        return client;
    }

    public Client update(Client client) {
        this.internalState.remove(client);
        this.internalState.add(client);
        return client;
    }
}
