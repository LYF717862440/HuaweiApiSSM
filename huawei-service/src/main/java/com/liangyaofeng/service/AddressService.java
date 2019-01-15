package com.liangyaofeng.service;

import com.liangyaofeng.entity.Address;

import java.util.List;

public interface AddressService {



    List<Address> selectAddressbyuid(String uid);


    boolean addAddress(Address address);


    boolean deleteAddressbyid(String id);


    boolean updateAddress(Address address);




}
