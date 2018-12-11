package com.liangyaofeng.test;


import com.liangyaofeng.dao.ClassifyDao;
import com.liangyaofeng.entity.Classify;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class ClassifyDaoTest {

    @Autowired
    ClassifyDao classifyDao;

    @Test
    public void test(){
        List<Classify> list=classifyDao.selectAllClassify();
        System.out.println(list);
    }



}
