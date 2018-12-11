package com.liangyaofeng.test;

import com.liangyaofeng.dao.UsersDao;
import com.liangyaofeng.entity.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

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




}
