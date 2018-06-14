package com.cww.tmall.service;


import com.cww.tmall.pojo.Review;

import java.util.List;

//评价
public interface ReviewService {
    void add(Review c);

    void delete(int id);

    void update(Review c);

    Review get(int id);

    List list(int pid);

    int getCount(int pid);
}
