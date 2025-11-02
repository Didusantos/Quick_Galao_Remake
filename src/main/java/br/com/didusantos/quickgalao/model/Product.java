package br.com.didusantos.quickgalao.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "Product")
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Getter @Setter long id;

    @Column(name = "NAME", nullable = false)
    private @Getter @Setter String name;

    @Column(name = "PRICE", nullable = false)
    private @Getter @Setter double price;

    @Column(name = "QUANTITY", nullable = false)
    private @Getter @Setter int quantity;


}
