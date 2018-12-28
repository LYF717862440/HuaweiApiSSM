package com.liangyaofeng.controller;

import com.liangyaofeng.common.R;
import com.liangyaofeng.dao.GoodsParamsDao;
import com.liangyaofeng.entity.Goodsparams;
import com.liangyaofeng.service.GoodsParamsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("goodsparams")
public class GoodsParamsController {


    @Autowired
    GoodsParamsService goodsParamsService;


    @RequestMapping("/goodsparamsInfopage")
    @ResponseBody
    public R goodsparamsInfopage(@RequestParam(defaultValue ="1")int param1, @RequestParam(defaultValue = "5")int param2,String brand,String cpuaudit,String screensize){
        return R.ok(goodsParamsService.getGoodsParamsPager(param1,param2,brand,cpuaudit,screensize));
    }

    @RequestMapping("/goodsparamscount")
    @ResponseBody
    public R goodsparamscount(String brand,String cpuaudit,String screensize){
        return R.ok(goodsParamsService.getGoodsParamsCount(brand,cpuaudit,screensize));
    }


    @RequestMapping("/selectbyid")
    @ResponseBody
    public R selectbyid(String gcoding){
        return  R.ok(goodsParamsService.selectGoodsParamsbygcoding(gcoding));
    }



    @RequestMapping("/add")
    @ResponseBody
    public R add(Goodsparams goodsparams){
        return  R.ok(goodsParamsService.addGoodsParams(goodsparams));
    }

    @RequestMapping("/update")
    @ResponseBody
    public R update(Goodsparams goodsparams){
        return  R.ok(goodsParamsService.updateGoodsParams(goodsparams));
    }

    @RequestMapping("/delete")
    @ResponseBody
    public R delete(String gcoding){
        return  R.ok(goodsParamsService.deleteGoodsParams(gcoding));
    }

    @RequestMapping("/deletelist")
    @ResponseBody
    public R deletelist(@RequestBody List<String> gcodings){
        return R.ok(goodsParamsService.deletegoodsbyList(gcodings));
    }





}
