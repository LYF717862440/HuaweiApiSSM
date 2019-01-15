package com.liangyaofeng.test;


import com.liangyaofeng.dao.ShopsDao;
import com.liangyaofeng.entity.Shops;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class ShopsDaoText {


    @Autowired
    ShopsDao shopsDao;


    @Test
    public void selectshopsbyuid(){
        List<Shops> list=shopsDao.selectShopsbyuid("1");
        System.out.println(list);
    }

    @Test
    public void delete(){
        System.out.println(shopsDao.deleteShopsbyid(11));
    }

    @Test
    public void add(){
        Shops shops=new Shops();
        shops.setUid(12);
        shops.setGid(1811220101);
        shops.setGimg("rongyao1.jpg");
        shops.setAmount(1);
        shops.setSname("荣耀10 全网通6GB+64GB （幻夜黑）");
        shops.setSprice(2000);
        shops.setTotals(2);

        System.out.println(shopsDao.addShops(shops));
    }




}
