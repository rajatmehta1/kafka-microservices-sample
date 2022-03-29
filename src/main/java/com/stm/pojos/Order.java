package com.stm.pojos;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.stm.orderservice.OrderStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;

@Data
public class Order {

    private Long orderId;
    private Long customerId;

    //expecting date in yyyy-MM-dd format
    @JsonDeserialize
    private Date orderDate;
    private ArrayList<OrderLineItem> items;
    private OrderStatus status;

    public Order() {
        items = new ArrayList<>();
    }
}
