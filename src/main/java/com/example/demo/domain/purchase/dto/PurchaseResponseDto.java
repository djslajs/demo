package com.example.demo.domain.purchase.dto;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;

@Getter
@Builder
public class PurchaseResponseDto {
    private Long purchaseId;
    private String username;
    private BigDecimal totalPrice;
}
