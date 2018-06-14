package com.cww.tmall.service;

import com.cww.tmall.pojo.Order;
import com.cww.tmall.pojo.OrderItem;

import java.util.List;

// 订单信息
public interface OrderService {
    String waitPay = "waitPay";
    String waitDelivery = "waitDelivery";
    String waitConfirm = "waitConfirm";
    String waitReview = "waitReview";
    String finish = "finish";
    String delete = "delete";

    void add(Order c);

    void delete(int id);

    void update(Order c);

    Order get(int id);

    List list();

    //订单增加
    float add(Order c,List<OrderItem> ois);

    //订单显示页面
    List list(int uid, String excludedStatus);
}
