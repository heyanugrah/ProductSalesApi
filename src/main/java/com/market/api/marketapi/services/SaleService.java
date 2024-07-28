package com.market.api.marketapi.services;

import DTO.DtoMapper;
import DTO.SaleDTO;
import com.market.api.marketapi.models.Sale;
import com.market.api.marketapi.repositories.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service class for handling operations related to Sale entities.
 * Provides methods to save Sale entities from DTOs to the database.
 *
 * Author: Anugrah Balakrishnan
 * Date Modified: 28 July 2024
 */
@Service
public class SaleService {

    @Autowired
    private SaleRepository saleRepository;

    /**
     * Saves a SaleDTO by converting it to a Sale entity and storing it in the database.
     * Converts the saved Sale entity back to a SaleDTO and returns it.
     *
     * @param saleDTO The SaleDTO to save
     * @return The saved SaleDTO
     */
    public SaleDTO saveSale(SaleDTO saleDTO) {
        Sale sale = DtoMapper.toSale(saleDTO);
        Sale savedSale = saleRepository.save(sale);
        return DtoMapper.toSaleDTO(savedSale);
    }
}
