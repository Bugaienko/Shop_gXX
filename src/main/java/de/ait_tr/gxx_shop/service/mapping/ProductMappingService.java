package de.ait_tr.gxx_shop.service.mapping;
/*
@date 14.07.2024
@author Sergey Bugaienko
*/

import de.ait_tr.gxx_shop.domain.dto.ProductDto;
import de.ait_tr.gxx_shop.domain.entity.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductMappingService {

    public Product mapDtoToEntity(ProductDto dto){
        Product entity = new Product();
        entity.setTitle(dto.getTitle());
        entity.setPrice(dto.getPrice());
        return entity;
    }

    public ProductDto mapEntityToDto(Product entity){
        ProductDto dto = new ProductDto();
        dto.setId(entity.getId());
        dto.setPrice(entity.getPrice());
        dto.setTitle(entity.getTitle());
        return dto;
    }
}