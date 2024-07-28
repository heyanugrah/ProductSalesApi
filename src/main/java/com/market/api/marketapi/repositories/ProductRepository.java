package com.market.api.marketapi.repositories;

import com.market.api.marketapi.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Repository interface for managing Product entities.
 * Extends JpaRepository to provide basic CRUD operations and pagination for Product entities.
 *
 * Author: Anugrah Balakrishnan
 * Date Modified: 28 July 2024
 *
 */
@Repository
@Transactional
public interface ProductRepository extends JpaRepository<Product, Long> {
}
