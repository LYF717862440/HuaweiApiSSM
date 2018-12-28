package com.liangyaofeng.service;

import com.liangyaofeng.entity.Goodsparams;

import java.util.List;

public interface GoodsParamsService {


    List<Goodsparams> selectAllGoodsParams();

    Goodsparams selectGoodsParamsbygcoding( String gcoding);

    List<Goodsparams> selectGoodsParamsbybrand(String brand);


    boolean addGoodsParams(Goodsparams goodsparams);

    boolean updateGoodsParams(Goodsparams goodsparams);


    boolean deleteGoodsParams(String gcoding);


    boolean deletegoodsbyList(List<String> gcodings);


    List<Goodsparams> getGoodsParamsPager(int pageNO, int size, String brand,String cpuaudit,String screensize);

    int getGoodsParamsCount(String brand,String cpuaudit,String screensize);


}
