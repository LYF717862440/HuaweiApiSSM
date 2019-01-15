package com.liangyaofeng.dao;

import com.liangyaofeng.entity.Address;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AddressDao {


    List<Address> selectAddressbyuid(@Param("uid") String uid);

    boolean addAddress(Address address);


    boolean deleteAddressbyid(@Param("id") String id);


    boolean updateAddress(Address address);


}
