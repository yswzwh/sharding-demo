package com.wyf.dao;

import com.wyf.entity.OrderItem;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Auther: yswzw
 * @Date: 2019/11/22 15:12
 * @Description:
 */
@Mapper
public interface OrderItemMapper {
    public int deleteByPrimaryKey(Long orderItemId);

    public int insert(OrderItem orderItem);

    public int updateByPrimaryKey(OrderItem orderItem);

    public OrderItem selectByPrimaryKey(Long orderItemId);

    public List<OrderItem> selectAll();
}
