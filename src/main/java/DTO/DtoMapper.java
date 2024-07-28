package DTO;

import com.market.api.marketapi.models.Product;
import com.market.api.marketapi.models.Sale;

import java.util.List;
import java.util.stream.Collectors;

public class DtoMapper {

    public static Product toProduct(ProductDTO productDTO) {
        if (productDTO == null) {
            return null;
        }

        Product product = new Product();
        product.setId(productDTO.getId());
        product.setName(productDTO.getName());
        product.setDescription(productDTO.getDescription());
        product.setPrice(productDTO.getPrice());
        product.setQuantity(productDTO.getQuantity());

        if (productDTO.getSales() != null) {
            List<Sale> sales = productDTO.getSales().stream()
                    .map(saleDTO -> {
                        Sale sale = toSale(saleDTO);
                        sale.setProduct(product); // Associate sale with the product
                        return sale;
                    })
                    .collect(Collectors.toList());
            product.setSales(sales);
        }

        return product;
    }

    public static ProductDTO toProductDTO(Product product) {
        if (product == null) {
            return null;
        }

        ProductDTO productDTO = new ProductDTO();
        productDTO.setId(product.getId());
        productDTO.setName(product.getName());
        productDTO.setDescription(product.getDescription());
        productDTO.setPrice(product.getPrice());
        productDTO.setQuantity(product.getQuantity());

        if (product.getSales() != null) {
            List<SaleDTO> salesDTO = product.getSales().stream()
                    .map(DtoMapper::toSaleDTO)
                    .collect(Collectors.toList());
            productDTO.setSales(salesDTO);
        }

        return productDTO;
    }

    public static Sale toSale(SaleDTO saleDTO) {
        if (saleDTO == null) {
            return null;
        }

        Sale sale = new Sale();
        sale.setId(saleDTO.getId());
        sale.setSaleDate(saleDTO.getSaleDate());
        sale.setQuantity(saleDTO.getQuantity());
        sale.setSalePrice(saleDTO.getSalePrice());

        if (saleDTO.getProductId() != null) {
            Product product = new Product(saleDTO.getProductId()); // Using new constructor
            sale.setProduct(product);
        }

        return sale;
    }

    public static SaleDTO toSaleDTO(Sale sale) {
        if (sale == null) {
            return null;
        }

        SaleDTO saleDTO = new SaleDTO();
        saleDTO.setId(sale.getId());
        saleDTO.setSaleDate(sale.getSaleDate());
        saleDTO.setQuantity(sale.getQuantity());
        saleDTO.setSalePrice(sale.getSalePrice());
        saleDTO.setProductId(sale.getProduct().getId());

        return saleDTO;
    }
}
