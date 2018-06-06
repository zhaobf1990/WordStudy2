package com.example.zhaobf.wordstudy.dao;

import com.example.zhaobf.wordstudy.model.MyWord;

public interface MyWordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MyWord record);

    int insertSelective(MyWord record);

    MyWord selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MyWord record);

    int updateByPrimaryKey(MyWord record);
}