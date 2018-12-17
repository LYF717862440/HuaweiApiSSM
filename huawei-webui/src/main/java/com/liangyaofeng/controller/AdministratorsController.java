package com.liangyaofeng.controller;

import com.liangyaofeng.common.R;
import com.liangyaofeng.entity.Administrators;
import com.liangyaofeng.entity.NoteResult;
import com.liangyaofeng.service.AdministratorsService;
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
@RequestMapping("admin")
public class AdministratorsController {

    @Autowired
    AdministratorsService administratorsService;


    //查询，登录验证账号
    @RequestMapping("/checklogin")
    @ResponseBody
    public NoteResult execute(String loginId, String password, HttpSession session) throws NoSuchAlgorithmException {
        session.setAttribute("loginId",loginId);
        NoteResult result = administratorsService.checkLogin(loginId,password);
        return result;
    }


    @RequestMapping("/adminInfopage")
    @ResponseBody
    public R adminInfopage(@RequestParam(defaultValue ="1")int param1, @RequestParam(defaultValue = "5")int param2,String loginId,String aname,String jop){
        return R.ok(administratorsService.getAdmnPager(param1,param2, loginId, aname, jop));
    }

    @RequestMapping("/admincount")
    @ResponseBody
    public R admincount(String loginId,String aname,String jop){
        return R.ok(administratorsService.getadminCount( loginId, aname, jop));
    }


    @RequestMapping("/selectbyid")
    @ResponseBody
    public R selectbyid(String aid){
        return  R.ok(administratorsService.selectAdminbyid(aid));
    }

    @RequestMapping("/add")
    @ResponseBody
    public R add(Administrators administrators){
        return  R.ok(administratorsService.addAdministrators(administrators));
    }

    @RequestMapping("/update")
    @ResponseBody
    public R update(Administrators administrators){
        return  R.ok(administratorsService.updateAdministrators(administrators));
    }

    @RequestMapping("/delete")
    @ResponseBody
    public R delete(String loginId){
        return  R.ok(administratorsService.deleteAdministrators(loginId));
    }

    @RequestMapping("/deletelist")
    @ResponseBody
    public R deletelist(@RequestBody List<String> loginIds){
        return R.ok(administratorsService.deleteadminbyList(loginIds));
    }



}
