package com.stm.orderservice;

import com.stm.pojos.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stm")
public class OrderServiceController {

    private OrderService orderService;

    @Autowired
    public OrderServiceController(OrderService orderService) {
        this.orderService = orderService;
    }


    //pass date field as yyyy-MM-dd
    @RequestMapping(path = "/order/submit",
                    consumes = "application/json",
                    produces = "application/json",
                    method = RequestMethod.POST)
    public @ResponseBody Order placeOrder(@RequestBody Order order) {
        if(null == order) throw new RuntimeException("Bad Order");
        return orderService.handleOrder(order);
    }

}
