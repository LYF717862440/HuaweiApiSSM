package com.liangyaofeng.service.Impl;

import com.liangyaofeng.dao.ShopsDao;
import com.liangyaofeng.entity.Shops;
import com.liangyaofeng.service.ShopsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopsServiceImpl implements ShopsService {


    @Autowired
    ShopsDao shopsDao;



    public List<Shops> selectShopsbyuid(String uid) {
        List<Shops> list =shopsDao.selectShopsbyuid(uid);
        return list;
    }

    public boolean addShops(Shops shops) {
        return shopsDao.addShops(shops);
    }

    public boolean deleteShopsbyid(int id) {
        return shopsDao.deleteShopsbyid(id);
    }
}
