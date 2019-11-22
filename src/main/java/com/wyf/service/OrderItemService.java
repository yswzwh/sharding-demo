package com.wyf.service;

import com.wyf.dao.OrderItemMapper;
import com.wyf.entity.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Auther: yswzw
 * @Date: 2019/11/22 15:34
 * @Description:
 */
@Service
public class OrderItemService {
    @Autowired
    private OrderItemMapper orderItemMapper;

    public void add(OrderItem orderItem) {
        orderItemMapper.insert(orderItem);
    }
}
