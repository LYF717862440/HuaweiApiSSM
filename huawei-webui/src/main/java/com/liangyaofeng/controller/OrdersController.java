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


    //查询总数
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



    @RequestMapping("/selectOrdersByordersid")
    @ResponseBody
    public R selectOrdersByordersid(String buyordersid) {
        return R.ok(ordersService.selectOrdersByordersid(buyordersid));
    }




    //添加
    @RequestMapping("/add")
    @ResponseBody
    public R add(List<Integer> ids){
        return  R.ok(ordersService.addAllOrders(ids));
    }


    //修改
    @RequestMapping("/update")
    @ResponseBody
    public R update(Orders orders){
        return  R.ok(ordersService.updateOrders(orders));
    }


    //修改数量
    @RequestMapping("/updateOAmount")
    @ResponseBody
    public R updateOAmount(Orders orders){
        return  R.ok(ordersService.updateOrdersByamount(orders));
    }




}
