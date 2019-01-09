package com.liangyaofeng.controller;

import com.liangyaofeng.common.R;
import com.liangyaofeng.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("picture")
public class PictureController {

    @Autowired
    PictureService pictureService;


    @RequestMapping("/selectbyimgnameAndgid")
    @ResponseBody
    public R selectbyimgnameAndgid(String imgname,String gid){
        return  R.ok(pictureService.selectbyimgname(imgname,gid));
    }


    @RequestMapping("/selectbyid")
    @ResponseBody
    public R selectbyid(String gid){
        return  R.ok(pictureService.selectPicturebygid(gid));
    }




    @RequestMapping("/picturepage")
    @ResponseBody
    public R picturepage(@RequestParam(defaultValue ="0")int skip, @RequestParam(defaultValue = "1")int size, String imgname, String gid){
        return R.ok(pictureService.getPicturePager(skip,size,imgname,gid));
    }





}
