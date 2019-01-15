package com.liangyaofeng.service;

import com.liangyaofeng.entity.Buyorders;
import com.liangyaofeng.entity.Orders;

import java.util.List;

public interface BuyordersService {



    List<Buyorders> selectBuyorders(String uid);


    boolean deletebuyorders(int id);


    boolean addBuyorders(Buyorders buyorders);



}
