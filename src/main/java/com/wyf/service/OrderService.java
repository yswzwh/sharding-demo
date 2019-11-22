package com.wyf.service;

import com.wyf.dao.OrderMapper;
import com.wyf.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: yswzw
 * @Date: 2019/11/22 15:34
 * @Description:
 */
@Service
public class OrderService {
    @Autowired
    private OrderMapper orderMapper;

    public void add(Order order) {
        orderMapper.insert(order);
    }
}
