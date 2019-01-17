package com.liangyaofeng.test;


import com.liangyaofeng.dao.OrdersDao;
import com.liangyaofeng.entity.Orders;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.List;

@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class OrdersDaoTest {


    @Autowired
    OrdersDao ordersDao;


    @Test
    public void add(){
        List<Integer> list=new ArrayList<Integer>();
        list.add(56);
        list.add(58);
//        list.add(23);
        System.out.println(ordersDao.addAllOrders(list));
    }


    @Test
    public void selectAllbyuid(){
        List<Orders> list=ordersDao.selectOrdersAll("5");
        System.out.println(list);
    }


    @Test
    public void update(){
        Orders orders=new Orders();

        orders.setOid(8);
        orders.setOstate("已发货");

        System.out.println(ordersDao.updateOrders(orders));
    }


    @Test
    public void updateoamount(){

        Orders orders=new Orders();

        orders.setOid(50);
        orders.setOAmount(5);

        System.out.println(ordersDao.updateOrdersByamount(orders));

    }




}
