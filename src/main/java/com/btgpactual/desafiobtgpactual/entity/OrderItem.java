package com.btgpactual.desafiobtgpactual.entity;

import java.math.BigDecimal;

import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderItem {
    private String product;

    private Integer quantity;

    @Field(targetType = FieldType.DECIMAL128)
    private BigDecimal price;
}
