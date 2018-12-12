package com.liangyaofeng.controller;

import com.liangyaofeng.common.R;
import com.liangyaofeng.entity.Classify;
import com.liangyaofeng.service.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


@Controller
@RequestMapping("classify")
public class ClassifyController {

    @Autowired
    ClassifyService classifyService;



    @RequestMapping("/classifyInfopage")
    @ResponseBody
    public R classifyInfopage(@RequestParam(defaultValue ="1")int param1, @RequestParam(defaultValue = "5")int param2){
        return R.ok(classifyService.getClassifyPager(param1,param2));
    }

    @RequestMapping("/classifycount")
    @ResponseBody
    public R classifycount(){
        return R.ok(classifyService.getClassifyCount());
    }



    @RequestMapping("/add")
    @ResponseBody
    public R add(Classify classify){
        return  R.ok(classifyService.addClassify(classify));
    }

    @RequestMapping("/update")
    @ResponseBody
    public R update(Classify classify){
        return  R.ok(classifyService.updateClassify(classify));
    }

    @RequestMapping("/delete")
    @ResponseBody
    public R delete(String cid){
        return  R.ok(classifyService.deleteClassify(cid));
    }

    @RequestMapping("/deletelist")
    @ResponseBody
    public R deletelist(@RequestBody List<String> cids){
        return R.ok(classifyService.deleteClasifyBylist(cids));
    }





}
