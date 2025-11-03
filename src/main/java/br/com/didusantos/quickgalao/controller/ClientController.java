package br.com.didusantos.quickgalao.controller;

import br.com.didusantos.quickgalao.model.Client;
import br.com.didusantos.quickgalao.repository.FakeClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/client")
public class ClientController {

    @Autowired
    private FakeClientRepository fakeClientRepository;

    @GetMapping
    public List<Client> findAll(){
        return fakeClientRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Client> findById(@PathVariable UUID id){
        return Optional.ofNullable(fakeClientRepository.findById(id));
    }

    @GetMapping("/name/{name}")
    public List<Client> findByName(@PathVariable String name){
        return fakeClientRepository.findByName(name);
    }

    @GetMapping("/address/{address}")
    public List<Client> findByAddress(@PathVariable String address){
        return fakeClientRepository.findByAddress(address);
    }

    @GetMapping("/phonenumber/{phoneNumber}")
    public List<Client> findByPhoneNumber(@PathVariable String phoneNumber){
        return fakeClientRepository.findByPhoneNumber(phoneNumber);
    }

    @PostMapping
    public Client save(@PathVariable Client client){
        return fakeClientRepository.create(client);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable UUID id){
        fakeClientRepository.removeById(id);
    }

    @PutMapping
    public Client update(@PathVariable Client client){
        return fakeClientRepository.update(client);
    }

    @PatchMapping
    public Client patch(@PathVariable Client client){
        return fakeClientRepository.update(client);
    }


}
