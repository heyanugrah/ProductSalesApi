package com.market.api.marketapi.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;
import java.util.List;

/**
 * Represents a product entity in the market application.
 * Each product has a name, description, price, quantity, and a list of associated sales.
 *
 * The `Product` class is mapped to the "products" table in the database.
 * It includes methods to add and remove sales associated with the product.
 *
 * Author: Anugrah Balakrishnan
 * Date Modified: 28 July 2024
 *
 */
@Entity
@Table(name = "products")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @JsonManagedReference
    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Sale> sales;

    /**
     * Constructor to initialize a Product with an ID.
     * @param id The ID of the product
     */
    public Product(Long id) {
        this.id = id;
    }

    /**
     * Method to add a Sale to the Product.
     * @param sale The Sale to add
     */
    public void addSale(Sale sale) {
        sales.add(sale);
        sale.setProduct(this);
    }

}
