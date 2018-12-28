package com.liangyaofeng.dao;

import com.liangyaofeng.entity.Goods;
import com.liangyaofeng.entity.GoodsMax;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsDao {

    List<Goods> selectAllGoods(@Param("gname") String gname);

    Goods selectgoodsBygid(@Param("gid") String gid);

    boolean addGoods(Goods goods);

    boolean updateGoods(Goods goods);

//    GoodsMax selectmaxgid();

    boolean deleteGoodsbyGid(String gid);

    boolean deletegoodsbyList(List<String> gids);

    List<Goods> getGoodsPager(@Param("skip") int skip,@Param("size") int size,@Param("gname")String gname,@Param("gtype")String gtype,@Param("colour")String colour);

    int getGoodsCount(@Param("gname")String gname,@Param("gtype")String gtype,@Param("colour")String colour);


}
