package com.btgpactual.desafiobtgpactual.entity;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "tb_orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderEntity {

    @MongoId
    private Long orderId;

    private Long customerId;

    private BigDecimal total;

    private List<OrderItem> itens;
}
