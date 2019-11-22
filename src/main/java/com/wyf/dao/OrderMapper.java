package com.wyf.dao;

import com.wyf.entity.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther: yswzw
 * @Date: 2019/11/22 15:12
 * @Description:
 */
@Mapper
public interface OrderMapper {
    public int deleteByPrimaryKey(Long orderId);

    public int insert(Order order);

    public int updateByPrimaryKey(Order order);

    public Order selectByPrimaryKey(Long orderId);

    public List<Order> selectAll();
}
