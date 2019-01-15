package com.liangyaofeng.controller;

import com.liangyaofeng.common.R;
import com.liangyaofeng.dao.AddressDao;
import com.liangyaofeng.entity.Address;
import com.liangyaofeng.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("address")
public class AddressController {


    @Autowired
    AddressService addressService;



    @RequestMapping("/selectbyuid")
    @ResponseBody
    public R selectbyuid(String uid) {
        return R.ok(addressService.selectAddressbyuid(uid));
    }


    @RequestMapping("/add")
    @ResponseBody
    public R add(Address address) {
        return R.ok(addressService.addAddress(address));
    }


    @RequestMapping("/delete")
    @ResponseBody
    public R delete(String id) {
        return R.ok(addressService.deleteAddressbyid(id));
    }


    @RequestMapping("/update")
    @ResponseBody
    public R update(Address address) {
        return R.ok(addressService.updateAddress(address));
    }





}
