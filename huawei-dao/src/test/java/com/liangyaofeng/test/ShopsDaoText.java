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




}
