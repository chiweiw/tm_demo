package com.cww.tmall.service;

import com.cww.tmall.pojo.ProductImage;

import java.util.List;

//创建ProductImageService，提供CURD。
//        同时还提供了两个常量，分别表示单个图片和详情图片：
//除此之外，还提供了根据产品id和图片类型查询的list方法

public interface ProductImageService {

    String type_single = "type_single";
    String type_detail = "type_detail";

    void add(ProductImage pi);

    void delete(int id);

    void update(ProductImage pi);

    ProductImage get(int id);

    List list(int pid, String type);
}
