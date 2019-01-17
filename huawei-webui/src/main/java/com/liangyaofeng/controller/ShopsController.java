package com.liangyaofeng.controller;


import com.liangyaofeng.common.R;
import com.liangyaofeng.entity.Shops;
import com.liangyaofeng.service.ShopsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("shops")
public class ShopsController {


    @Autowired
    ShopsService shopsService;


    //根据用户编号查询
    @RequestMapping("/selectshopsbyuid")
    @ResponseBody
    public R selectshopsbyuid(String uid){
        return  R.ok(shopsService.selectShopsbyuid(uid));
    }


    @RequestMapping("/add")
    @ResponseBody
    public R add(Shops shops){
        return  R.ok(shopsService.addShops(shops));
    }


    @RequestMapping("/delete")
    @ResponseBody
    public R delete(int id){
        return  R.ok(shopsService.deleteShopsbyid(id));
    }



    @RequestMapping("/updatebyid")
    @ResponseBody
    public R updatebyid(Shops shops){
        return  R.ok(shopsService.updateShopsByid(shops));
    }






}
