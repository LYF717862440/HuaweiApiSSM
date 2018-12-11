package com.liangyaofeng.controller;

import com.liangyaofeng.common.R;
import com.liangyaofeng.dao.GoodsParamsDao;
import com.liangyaofeng.service.GoodsParamsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("goodsparams")
public class GoodsParamsController {


    @Autowired
    GoodsParamsService goodsParamsService;


    @RequestMapping("/goodsparamsInfopage")
    @ResponseBody
    public R goodsparamsInfopage(@RequestParam(defaultValue ="1")int param1, @RequestParam(defaultValue = "5")int param2){
        return R.ok(goodsParamsService.getGoodsParamsPager(param1,param2));
    }

    @RequestMapping("/goodsparamscount")
    @ResponseBody
    public R goodsparamscount(){
        return R.ok(goodsParamsService.getGoodsParamsCount());
    }





}
