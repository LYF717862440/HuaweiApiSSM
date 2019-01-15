package com.liangyaofeng.service.Impl;

import com.liangyaofeng.dao.AddressDao;
import com.liangyaofeng.entity.Address;
import com.liangyaofeng.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {


    @Autowired
    AddressDao addressDao;




    public List<Address> selectAddressbyuid(String uid) {
        List<Address> list=addressDao.selectAddressbyuid(uid);
        return list;
    }

    public boolean addAddress(Address address) {
        return addressDao.addAddress(address);
    }

    public boolean deleteAddressbyid(String id) {
        return addressDao.deleteAddressbyid(id);
    }

    public boolean updateAddress(Address address) {
        return addressDao.updateAddress(address);
    }
}
