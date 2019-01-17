package com.liangyaofeng.controller;


import com.liangyaofeng.common.R;
import com.liangyaofeng.entity.Buyorders;
import com.liangyaofeng.service.BuyordersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("buyorders")
public class BuyordersController {


    @Autowired
    BuyordersService buyordersService;


    @RequestMapping("/selectbyuid")
    @ResponseBody
    public R selectbyuid(String uid){
        return  R.ok(buyordersService.selectBuyorders(uid));
    }

    @RequestMapping("/add")
    @ResponseBody
    public R add(Buyorders buyorders){
        return  R.ok(buyordersService.addBuyorders(buyorders));
    }

    @RequestMapping("/delete")
    @ResponseBody
    public R delete(int id){
        return  R.ok(buyordersService.deletebuyorders(id));
    }






}
