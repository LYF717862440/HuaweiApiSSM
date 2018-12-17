package com.liangyaofeng.service;

import com.liangyaofeng.entity.Goods;

import java.util.List;

public interface GoodsService {


    List<Goods> selectAllGoods(String gname);

    Goods selectgoodsBygid(String gid);

    boolean addGoods(Goods goods);

    boolean updateGoods(Goods goods);

    boolean deleteGoodsbyGid(String gid);

    boolean deletegoodsbyList(List<String> gids);

    List<Goods> getGoodsPager(int pageNO, int size,String gname,String gtype,String colour);

    int getGoodsCount(String gname,String gtype,String colour);


}
