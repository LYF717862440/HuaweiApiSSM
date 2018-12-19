package com.liangyaofeng.test;


import com.liangyaofeng.dao.AdministratorsDao;
import com.liangyaofeng.entity.Administrators;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
//@Transactional
//@TransactionConfiguration(defaultRollback = true)  //被弃用
//@Rollback(true)  //是否回滚
public class AdministratorsDaoTest {

    @Autowired
    AdministratorsDao administratorsDao;


    @Test
    public void test(){
        List<Administrators> list=administratorsDao.selectAllAdmin();
        System.out.println(list);
    }

    @Test
    public void add(){
        Administrators administrators=new Administrators();
    }


    @Test
    public void page(){
        System.out.println(administratorsDao.getadminCount("","",""));
    }





}
