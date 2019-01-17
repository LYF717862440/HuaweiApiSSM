package com.liangyaofeng.test;


import com.liangyaofeng.dao.BuyordersDao;
import com.liangyaofeng.entity.Buyorders;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class BuyordersDaoTest {


    @Autowired
    BuyordersDao buyordersDao;


    @Test
    public void add(){
        Buyorders buyorders=new Buyorders();

        buyorders.setUid(1);
        buyorders.setUname("李莉");
        buyorders.setPostcode("505900");
        buyorders.setUaddress("南方IT学院");
        buyorders.setUphone("1234345434");
        buyorders.setBuyordersid(31);
        buyorders.setTotal(9000);

        System.out.println(buyordersDao.addBuyorders(buyorders));

    }







}
