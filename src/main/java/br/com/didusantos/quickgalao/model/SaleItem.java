package br.com.didusantos.quickgalao.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class SaleItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Getter @Setter long id;

    @Column(name = "QUANTITY", nullable = false)
    private @Getter @Setter int quantity;

    @Column(name = "REGISTRATION_UNIT_PRICE", nullable = false)
    private @Getter @Setter double registrationUnitPrice;

    @ManyToOne
    @JoinColumn(name = "SALE_ID")
    private @Getter @Setter Sale sale;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    private @Getter @Setter Product product;


}
