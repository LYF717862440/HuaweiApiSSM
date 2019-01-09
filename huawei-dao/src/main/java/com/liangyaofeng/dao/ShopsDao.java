package com.liangyaofeng.dao;

import com.liangyaofeng.entity.Shops;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ShopsDao {


    List<Shops> selectShopsbyuid(@Param("uid") String uid);

    boolean addShops(Shops shops);

    boolean deleteShopsbyid(int id);


}
