package com.liangyaofeng.controller;

import com.liangyaofeng.common.R;
import com.liangyaofeng.entity.Orders;
import com.liangyaofeng.entity.Shops;
import com.liangyaofeng.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("orders")
public class OrdersController {


    @Autowired
    OrdersService ordersService;


    //    分页查询
    @RequestMapping("/ordersInfopage")
    @ResponseBody
    public R ordersInfopage(@RequestParam(defaultValue ="1")int param1, @RequestParam(defaultValue = "5")int param2, String uid, String gid,String cname,String ostate){
        return R.ok(ordersService.getOrdersPager(param1,param2,uid,gid,cname,ostate));
    }



    @RequestMapping("/orderscount")
    @ResponseBody
    public R orderscount(String uid,String gid,String cname,String ostate){
        return R.ok(ordersService.getOrdersCount(uid,gid,cname,ostate));
    }




    @RequestMapping("/selectbyuid")
    @ResponseBody
    public R selectbyuid(String uid) {
        return R.ok(ordersService.selectOrdersAll(uid));
    }


    @RequestMapping("/selectbyordersid")
    @ResponseBody
    public R selectbyordersid(String buyordersid) {
        return R.ok(ordersService.selectOrdersAll(buyordersid));
    }





    @RequestMapping("/add")
    @ResponseBody
    public R add(@RequestBody List<Integer> ids){
        return  R.ok(ordersService.addAllOrders(ids));
    }


    @RequestMapping("/update")
    @ResponseBody
    public R update(Orders orders){
        return  R.ok(ordersService.updateOrders(orders));
    }




}
