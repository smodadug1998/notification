package com.ecommerce.notification.payload;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class OrderItemDTO {
    private Long id;
    private Long productId;
    private Integer quantity;
    private BigDecimal price;
    private BigDecimal subtotal;
}
