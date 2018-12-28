package com.liangyaofeng.controller;

import com.liangyaofeng.common.R;
import com.liangyaofeng.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("picture")
public class PictureController {

    @Autowired
    PictureService pictureService;


    @RequestMapping("/selectall")
    @ResponseBody
    public R selectall(String gid){
        return  R.ok(pictureService.selectAllPicture());
    }


    @RequestMapping("/selectbyid")
    @ResponseBody
    public R selectbyid(String gid){
        return  R.ok(pictureService.selectPicturebygid(gid));
    }



}
