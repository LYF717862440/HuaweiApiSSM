package com.liangyaofeng.service;

import com.liangyaofeng.entity.Shops;

import java.util.List;

public interface ShopsService {

    List<Shops> selectShopsbyuid(String uid);

    boolean addShops(Shops shops);


    boolean deleteShopsbyid(int id);


}
