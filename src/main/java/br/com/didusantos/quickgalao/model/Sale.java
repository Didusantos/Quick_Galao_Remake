package br.com.didusantos.quickgalao.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Sale")
@Entity
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Getter @Setter long id;

    @Column(name = "SALE_DATE", nullable = false)
    private @Getter @Setter Timestamp date;

    @Column(name = "STATUS", nullable = false)
    private @Getter @Setter String status;

    @Column(name = "PRICE_TOTAL")
    private @Getter @Setter double price;

    @ManyToOne
    @JoinColumn(name = "CLIENT_ID",nullable = false)
    private Client clients;
}
