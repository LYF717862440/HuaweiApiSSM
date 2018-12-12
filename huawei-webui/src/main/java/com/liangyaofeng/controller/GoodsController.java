package com.liangyaofeng.controller;

import com.liangyaofeng.common.R;
import com.liangyaofeng.entity.Goods;
import com.liangyaofeng.entity.NoteResult;
import com.liangyaofeng.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.security.NoSuchAlgorithmException;
import java.util.List;

@Controller
@RequestMapping("goods")
public class GoodsController {

    @Autowired
    GoodsService goodsService;


    @RequestMapping("/goodsInfopage")
    @ResponseBody
    public R goodsInfopage(@RequestParam(defaultValue ="1")int param1,@RequestParam(defaultValue = "5")int param2){
        return R.ok(goodsService.getGoodsPager(param1,param2));
    }

    @RequestMapping("/goodscount")
    @ResponseBody
    public R goodscount(){
        return R.ok(goodsService.getGoodsCount());
    }


    @RequestMapping("/add")
    @ResponseBody
    public R add(Goods goods){
        return  R.ok(goodsService.addGoods(goods));
    }

    @RequestMapping("/update")
    @ResponseBody
    public R update(Goods goods){
        return  R.ok(goodsService.updateGoods(goods));
    }

    @RequestMapping("/delete")
    @ResponseBody
    public R delete(String gid){
        return  R.ok(goodsService.deleteGoodsbyGid(gid));
    }

    @RequestMapping("/deletelist")
    @ResponseBody
    public R deletelist(@RequestBody List<String> gids){
        return R.ok(goodsService.deletegoodsbyList(gids));
    }



}
