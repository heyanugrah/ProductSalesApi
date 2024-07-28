package DTO;

import java.time.LocalDate;
import lombok.Data;

@Data
public class SaleDTO {
    private Long id;
    private LocalDate saleDate;
    private Integer quantity;
    private Double salePrice;
    private Long productId;
}

