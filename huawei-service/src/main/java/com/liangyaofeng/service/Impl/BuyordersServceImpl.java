package com.liangyaofeng.service.Impl;

import com.liangyaofeng.dao.BuyordersDao;
import com.liangyaofeng.entity.Buyorders;
import com.liangyaofeng.entity.Orders;
import com.liangyaofeng.service.BuyordersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyordersServceImpl implements BuyordersService {



    @Autowired
    BuyordersDao buyordersDao;


    public Buyorders selectBuyorders(String uid) {
        Buyorders list=buyordersDao.selectBuyorders(uid);
        return list;
    }

    public boolean deletebuyorders(int id) {
        return buyordersDao.deletebuyorders(id);
    }

    public boolean addBuyorders(Buyorders buyorders) {
        return buyordersDao.addBuyorders(buyorders);
    }
}
