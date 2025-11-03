package br.com.didusantos.quickgalao.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CLIENT")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private @Getter @Setter UUID id;

    @Column(name = "NAME", nullable = false)
    private @Getter @Setter String name;

    @Column(name = "ADDRESS", nullable = false)
    private @Getter @Setter String address;

    @Column(name = "PHONE_NUMBER", nullable = false)
    private @Getter @Setter String phoneNumber;


}
