package com.market.api.marketapi.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

/**
 * Represents a sale entity in the market application.
 * Each sale has a sale date, quantity sold, sale price, and is associated with a product.
 *
 * The `Sale` class is mapped to the "sales" table in the database.
 * It includes a reference to the associated product through the `product` field.
 *
 * Author: Anugrah Balakrishnan
 * Date Modified: 28 July 2024
 *
 */
@Entity
@Table(name = "sales")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sale_date", nullable = false)
    private LocalDate saleDate;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "sale_price", nullable = false)
    private Double salePrice;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;
}
