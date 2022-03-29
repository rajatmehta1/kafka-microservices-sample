package com.stm.pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderLineItem {
    private Integer lineItemID;
    private Long productId;
    private Integer quantity;
    private Double productPrice;

}
