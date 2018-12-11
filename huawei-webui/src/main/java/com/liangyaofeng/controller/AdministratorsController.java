package com.liangyaofeng.controller;

import com.liangyaofeng.common.R;
import com.liangyaofeng.service.AdministratorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("admin")
public class AdministratorsController {

    @Autowired
    AdministratorsService administratorsService;


    @RequestMapping("/adminInfopage")
    @ResponseBody
    public R adminInfopage(@RequestParam(defaultValue ="1")int param1, @RequestParam(defaultValue = "5")int param2){
        return R.ok(administratorsService.getAdmnPager(param1,param2));
    }

    @RequestMapping("/admincount")
    @ResponseBody
    public R admincount(){
        return R.ok(administratorsService.getadminCount());
    }



}
