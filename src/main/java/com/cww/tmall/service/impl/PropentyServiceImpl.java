package com.cww.tmall.service.impl;


import com.cww.tmall.mapper.PropertyMapper;
import com.cww.tmall.pojo.Property;
import com.cww.tmall.pojo.PropertyExample;
import com.cww.tmall.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropentyServiceImpl implements PropertyService {
    @Autowired
    PropertyMapper propertyMapper;

    @Override
    public void add(Property c) {
        propertyMapper.insert(c);
    }

    @Override
    public void delete(int id) {
        propertyMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void update(Property c) {
        propertyMapper.updateByPrimaryKeySelective(c);
    }

    @Override
    public Property get(int id) {
        return propertyMapper.selectByPrimaryKey(id);
    }

    @Override
    public List list(int cid) {
        PropertyExample example =new PropertyExample();
        example.createCriteria().andCidEqualTo(cid);
        example.setOrderByClause("id desc");
        return propertyMapper.selectByExample(example);
    }
}
