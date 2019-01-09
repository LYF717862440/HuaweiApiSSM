package com.liangyaofeng.test;

import com.liangyaofeng.dao.PictureDao;
import com.liangyaofeng.entity.Picture;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class PictureDaoTest {

    @Autowired
    PictureDao pictureDao;


    @Test
    public void selectbyimgname(){

        List<Picture> list=pictureDao.selectbyimgname("小图","1811220101");
        System.out.println(list);
    }

    @Test
    public void text(){

        List<Picture> list =pictureDao.getPicturePager(0,1,"大图","1811220101");

        System.out.println(list);
    }



}
