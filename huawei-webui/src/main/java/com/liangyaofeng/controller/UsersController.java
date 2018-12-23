package com.liangyaofeng.controller;

import com.liangyaofeng.common.R;
import com.liangyaofeng.entity.Users;
import com.liangyaofeng.service.UsersServie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.xml.crypto.Data;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("users")
public class UsersController {


    @Autowired
    UsersServie usersServie;


    @RequestMapping("/usersInfopage")
    @ResponseBody
    public R usersInfopage(@RequestParam(defaultValue ="1")int param1, @RequestParam(defaultValue = "5")int param2,String loginId,String uname){
        return R.ok(usersServie.getUsersPager(param1,param2,loginId,uname));
    }

    @RequestMapping("/userscount")
    @ResponseBody
    public R userscount(String loginId,String uname){
        return R.ok(usersServie.getUsersCount( loginId, uname));
    }


    @RequestMapping("/selectbyid")
    @ResponseBody
    public R selectbyid(String uid){
        return  R.ok(usersServie.selectuersbyid(uid));
    }


    @RequestMapping("/add")
    @ResponseBody
    public R add(HttpServletRequest request){
        String loginId=request.getParameter("loginId");
        String password=request.getParameter("password");
        String uname=request.getParameter("uname");
        String sex=request.getParameter("sex");
        String uphone=request.getParameter("uphone");
        Double balance=Double.parseDouble(request.getParameter("balance"));


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String ubirthday=request.getParameter("ubirthday");

        String ustate=request.getParameter("ustate");

        Date date = new Date();
//        Timestamp ts = new Timestamp(ubirthday);

        Users users=new Users();
        users.setLoginId(loginId);
        users.setPassword(password);
        users.setUname(uname);
        users.setSex(sex);
        users.setUphone(uphone);
        users.setBalance(balance);
//        users.getUbirthday(ts);
        users.setUstate(ustate);
        return  R.ok(usersServie.addUsers(users));
    }

    @RequestMapping("/update")
    @ResponseBody
    public R update(Users users){
        return  R.ok(usersServie.updateUsers(users));
    }

    @RequestMapping("/delete")
    @ResponseBody
    public R delete(String loginId){
        return  R.ok(usersServie.deleteUsersbyloginId(loginId));
    }

    @RequestMapping("/deletelist")
    @ResponseBody
    public R deletelist(@RequestBody List<String> loginIds){
        return R.ok(usersServie.deleteUsersbyList(loginIds));
    }



}
