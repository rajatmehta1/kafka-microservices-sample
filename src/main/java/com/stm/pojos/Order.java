package com.stm.pojos;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.stm.orderservice.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

//    @JsonProperty
    private Long orderId;

//    @JsonProperty
    private Long customerId;

    //expecting date in yyyy-MM-dd format
//    @JsonProperty
//    private Date orderDate;

//    private ArrayList<OrderLineItem> items;
//    @JsonProperty
//    private OrderStatus status;

//    public Order() {
//        items = new ArrayList<>();
//    }
}
