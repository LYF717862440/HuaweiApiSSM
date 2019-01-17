package com.liangyaofeng.dao;

import com.liangyaofeng.entity.Buyorders;
import com.liangyaofeng.entity.Orders;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BuyordersDao {

    Buyorders selectBuyorders(@Param("uid") String uid);


    boolean deletebuyorders(@Param("id") int id);


    boolean addBuyorders(Buyorders buyorders);




}
