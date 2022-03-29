package com.stm.orderservice;

import com.stm.pojos.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderService {

    public Order handleOrder(Order order) {
        log.info("Start Handling Order");
        log.info("Input order \n" + order.toString());
            order.setStatus(OrderStatus.IN_PROCESS);
            return order;
    }
}
