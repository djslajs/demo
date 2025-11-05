package com.example.demo.domain.purchase.dto;

import com.example.demo.domain.purchase.entity.Purchase;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PurchaseMapper {

    @Mapping( source = "id", target = "purchaseId")
    @Mapping( source = "user.username", target = "username")
    PurchaseResponseDto toResponseDto(Purchase purchase);
}
