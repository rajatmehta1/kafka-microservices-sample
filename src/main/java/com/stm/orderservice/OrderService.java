package com.stm.orderservice;

import com.stm.pojos.Order;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.kafka.core.KafkaTemplate;

@Service
@Slf4j
public class OrderService {

    private KafkaTemplate<String, Order> kafkaTemplate;

    @Value("${kafka-topic-name}")
    private String kafkaTopic;

    @Autowired
    private OrderService(KafkaTemplate<String, Order> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public Order handleOrder(Order order) {
        log.info("Start Handling Order");
        log.info("Input order \n" + order.toString());
        log.info("Kafka TOPIC \n" + kafkaTopic);
        Order o = new Order();
            o.setOrderId(323l);
            o.setCustomerId(23324l);
//            order.setStatus(OrderStatus.NEW_ORDER);
            this.kafkaTemplate.send(kafkaTopic, o);
            return order;
    }

}
