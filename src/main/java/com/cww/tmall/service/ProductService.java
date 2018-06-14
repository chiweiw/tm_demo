package com.cww.tmall.service;

import com.cww.tmall.pojo.Category;
import com.cww.tmall.pojo.Product;

import java.util.List;

public interface ProductService {

    void add(Product p);

    void delete(int id);

    void update(Product p);

    Product get(int id);

    List list(int cid);

    void setFirstProductImage(Product p);



    void fill(List<Category> cs);

    void fill(Category c);

    void fillByRow(List<Category> cs);
//    ，增加为产品设置销量和
    void setSaleAndReviewNumber(Product p);
//   ，增加 评价数量的方法：
    void setSaleAndReviewNumber(List<Product> ps);

    //查找商品
    List<Product> search(String keyword);


}
