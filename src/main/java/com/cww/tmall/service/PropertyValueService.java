package com.cww.tmall.service;

import com.cww.tmall.pojo.Product;
import com.cww.tmall.pojo.PropertyValue;

import java.util.List;


/**
 *
 * 产品属性值设置的接口
 * */
public interface PropertyValueService {

    void init(Product p);

    void update(PropertyValue pv);

    PropertyValue get(int ptid, int pid);

    List<PropertyValue> list(int pid);
}
