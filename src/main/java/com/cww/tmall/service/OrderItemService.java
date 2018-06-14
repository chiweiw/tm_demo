package com.cww.tmall.service;

import com.cww.tmall.pojo.Order;
import com.cww.tmall.pojo.OrderItem;

import java.util.List;

//具体内容
public interface OrderItemService {

    void add(OrderItem c);

    void delete(int id);

    void update(OrderItem c);

    OrderItem get(int id);

    List list();

    void fill(List<Order> os);

    void fill(Order o);

    //    增加根据产品获取销售量的方法：
    int getSaleCount(int pid);

    //用户购买
    List<OrderItem> listByUser(int uid);
}
