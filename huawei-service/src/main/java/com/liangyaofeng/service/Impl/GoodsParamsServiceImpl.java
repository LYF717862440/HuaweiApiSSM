package com.liangyaofeng.service.Impl;

import com.liangyaofeng.dao.GoodsDao;
import com.liangyaofeng.dao.GoodsParamsDao;
import com.liangyaofeng.entity.Goodsparams;
import com.liangyaofeng.service.GoodsParamsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsParamsServiceImpl implements GoodsParamsService {

    @Autowired
    GoodsParamsDao goodsParamsDao;


    public List<Goodsparams> selectAllGoodsParams() {
        return goodsParamsDao.selectAllGoodsParams();
    }

    public Goodsparams selectGoodsParamsbygcoding(String gcoding) {
        return goodsParamsDao.selectGoodsParamsbygcoding(gcoding);
    }

    public List<Goodsparams> selectGoodsParamsbybrand(String brand) {
        return goodsParamsDao.selectGoodsParamsbybrand(brand);
    }

    public boolean addGoodsParams(Goodsparams goodsparams) {
        return goodsParamsDao.addGoodsParams(goodsparams);
    }

    public boolean updateGoodsParams(Goodsparams goodsparams) {
        return goodsParamsDao.updateGoodsParams(goodsparams);
    }

    public boolean deleteGoodsParams(String gcoding) {
        return goodsParamsDao.deleteGoodsParams(gcoding);
    }

    public boolean deletegoodsbyList(List<String> gcodings) {
        return false;
    }

    public List<Goodsparams> getGoodsParamsPager(int pageNO, int size) {
        int skip=(pageNO-1)*size;
        return goodsParamsDao.getGoodsParamsPager(skip,size);
    }

    public int getGoodsParamsCount() {
        return goodsParamsDao.getGoodsParamsCount();
    }
}
