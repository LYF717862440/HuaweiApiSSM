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

import java.util.List;


@Controller
@RequestMapping("users")
public class UsersController {


    @Autowired
    UsersServie usersServie;


    @RequestMapping("/usersInfopage")
    @ResponseBody
    public R usersInfopage(@RequestParam(defaultValue ="1")int param1, @RequestParam(defaultValue = "5")int param2){
        return R.ok(usersServie.getUsersPager(param1,param2));
    }

    @RequestMapping("/userscount")
    @ResponseBody
    public R userscount(){
        return R.ok(usersServie.getUsersCount());
    }




    @RequestMapping("/add")
    @ResponseBody
    public R add(Users users){
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
