package com.liangyaofeng.service.Impl;

import com.liangyaofeng.dao.GoodsDao;
import com.liangyaofeng.entity.Goods;
import com.liangyaofeng.service.GoodsService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService{


    @Autowired
    GoodsDao goodsDao;


    public List<Goods> selectAllGoods(String gname) {
        if (StringUtils.isEmpty(gname)){
            gname=null;
        }
        return goodsDao.selectAllGoods(gname);
    }

    public Goods selectgoodsBygid(String gid) {
        Goods goods=goodsDao.selectgoodsBygid(gid);
        return goods;
    }

    public boolean addGoods(Goods goods) {
        return goodsDao.addGoods(goods);
    }

    public boolean updateGoods(Goods goods) {
        return goodsDao.updateGoods(goods);
    }

    public boolean deleteGoodsbyGid(String gid) {
        return goodsDao.deleteGoodsbyGid(gid);
    }

    public boolean deletegoodsbyList(List<String> gids) {
        if(gids==null||gids.size()<=0) {
            return false;
        }
        return goodsDao.deletegoodsbyList(gids);
    }

    public List<Goods> getGoodsPager(int pageNO, int size) {
        int skip=(pageNO-1)*size;
        return goodsDao.getGoodsPager(skip, size);
    }

    public int getGoodsCount() {
        return goodsDao.getGoodsCount();
    }
}
