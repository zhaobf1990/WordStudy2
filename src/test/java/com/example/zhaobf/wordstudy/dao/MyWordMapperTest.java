package com.example.zhaobf.wordstudy.dao;

import com.example.zhaobf.wordstudy.WordStudyApplicationTests;
import com.example.zhaobf.wordstudy.model.MyWord;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

import static org.junit.Assert.*;

public class MyWordMapperTest  extends WordStudyApplicationTests {
    @Autowired
    MyWordMapper myWordMapper;
    @Test
    public void selectByPrimaryKey() throws Exception {
    }

    @Test
    public void insert() {
        MyWord word=new MyWord();
        word.setChinese("232r3");
        word.setWord("me");
        word.setCreateTime(new Date());
        word.setUpdateTime(new Date());

        myWordMapper.insert(word);

        System.out.println(word.getId());
    }

}