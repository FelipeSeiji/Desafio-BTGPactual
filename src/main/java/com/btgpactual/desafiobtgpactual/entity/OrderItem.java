package com.btgpactual.desafiobtgpactual.entity;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {
    private String product;

    private Integer quantity;

    private BigDecimal price;
}
