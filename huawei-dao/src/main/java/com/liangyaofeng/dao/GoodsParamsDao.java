package com.liangyaofeng.dao;

import com.liangyaofeng.entity.Goods;
import com.liangyaofeng.entity.Goodsparams;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsParamsDao {

    List<Goodsparams> selectAllGoodsParams();

    Goodsparams selectGoodsParamsbygcoding(@Param("gcoding") String gcoding);

    List<Goodsparams> selectGoodsParamsbybrand(@Param("brand")String brand);


    boolean addGoodsParams(Goodsparams goodsparams);

    boolean updateGoodsParams(Goodsparams goodsparams);


    boolean deleteGoodsParams(@Param("gcoding")String gcoding);


    boolean deletegoodsbyList(List<String> gcodings);


    List<Goodsparams> getGoodsParamsPager(@Param("skip") int skip, @Param("size") int size,@Param("brand") String brand,@Param("cpuaudit") String cpuaudit,@Param("screensize")String screensize);

    int getGoodsParamsCount(@Param("brand") String brand,@Param("cpuaudit") String cpuaudit,@Param("screensize")String screensize);



}
