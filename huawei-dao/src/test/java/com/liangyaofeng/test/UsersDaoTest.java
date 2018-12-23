package com.liangyaofeng.test;

import com.liangyaofeng.dao.UsersDao;
import com.liangyaofeng.entity.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class UsersDaoTest {

    @Autowired
    UsersDao usersDao;


    @Test
    public void test(){
        List<Users> list=usersDao.selectAllUsersbytwo(2,"","");
        System.out.println(list);
    }

    @Test
    public void add(){
        Users users=new Users();

        users.setLoginId("23232326");
        users.setPassword("222222");
        users.setUname("waiguang");
        users.setSex("男");
        users.setUphone("1234543433");

        String tsStr = "2011-05-09 11:49:45";
        Timestamp ts = Timestamp.valueOf(tsStr);  // 2011-05-09 11:49:45.0

//        Date date = new Date();
//        Timestamp ts = new Timestamp(date.getTime());
//        System.out.println(ts); // 2017-01-15 21:33:32.20

        users.setUbirthday(ts);
        users.setBalance(2);
        users.setUstate("正常");


        System.out.println(usersDao.addUsers(users));
    }




}
