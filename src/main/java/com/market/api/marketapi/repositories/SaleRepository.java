package com.market.api.marketapi.repositories;

/**
 * Repository interface for managing Sale entities.
 * Extends JpaRepository to provide basic CRUD operations and pagination for Sale entities.
 *
 * Author: Anugrah Balakrishnan
 * Date Modified: 28 July 2024
 *
 */
import org.springframework.stereotype.Repository;
import com.market.api.marketapi.models.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface SaleRepository extends JpaRepository<Sale, Long> {
}
