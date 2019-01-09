package com.liangyaofeng.controller;


import com.liangyaofeng.common.R;
import com.liangyaofeng.service.GpictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("gpicture")
public class GpictureController {

    @Autowired
    GpictureService gpictureService;


    @RequestMapping("/selectbygid")
    @ResponseBody
    public R selectbygid(String gid){
        return  R.ok(gpictureService.selectGpicturebygid(gid));
    }



}
