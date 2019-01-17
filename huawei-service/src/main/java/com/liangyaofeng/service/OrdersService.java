package com.liangyaofeng.service;

import com.liangyaofeng.entity.Orders;

import java.util.List;

public interface OrdersService {


    List<Orders> selectOrdersAll(String uid);

    List<Orders> selectOrdersByordersid(String buyordersid);


    boolean addAllOrders(List<Integer> ids);


    boolean updateOrders(Orders orders);

    boolean updateOrdersByamount(Orders orders);


    List<Orders> getOrdersPager( int pageNO, int size, String uid, String gid, String cname,String ostate);



    int getOrdersCount(String uid, String gid, String cname,String ostate);

}
