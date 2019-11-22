package com.wyf.rest;

import com.wyf.entity.Order;
import com.wyf.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @Auther: yswzw
 * @Date: 2019/11/21 14:43
 * @Description:
 */
@RestController
@RequestMapping
public class TestRest {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/addOrder")
    public String addOrder() {
        for(long i=0; i<2; i++) {
            for(long j=0; j<10; j++) {
                Order order = new Order();
                order.setOrderId(j);
                order.setUserId(i);
                order.setTotalPrice(new Random().nextDouble());
                order.setStatus("INIT");
                orderService.add(order);
            }
        }
        return "success";
    }

}
