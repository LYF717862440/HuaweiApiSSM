package com.liangyaofeng.dao;

import com.liangyaofeng.entity.Orders;
import org.apache.ibatis.annotations.Param;
import org.springframework.core.annotation.Order;

import java.util.List;

public interface OrdersDao {

    List<Orders> selectOrdersAll(@Param("uid") String uid);


    List<Orders> selectOrdersByordersid(@Param("buyordersid")String buyordersid);


    boolean addAllOrders(List<Integer> ids);


    boolean updateOrders(Orders orders);


    boolean updateOrdersByamount(Orders orders);


    List<Orders> getOrdersPager(@Param("skip") int skip,@Param("size") int size,@Param("uid") String uid,@Param("gid") String gid,@Param("cname") String cname,@Param("ostate")String ostate);



    int getOrdersCount(@Param("uid") String uid,@Param("gid") String gid,@Param("cname") String cname,@Param("ostate")String ostate);


}
