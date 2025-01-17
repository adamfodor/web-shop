package com.shop.order_service.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "t_order_line_items")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class OrderLineItems {

    @Id
    @GeneratedValue
    private Long id;
    private String skuCode;
    private BigDecimal price;
    private Integer quantity;
}
