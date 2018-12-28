package com.liangyaofeng.test;

import com.liangyaofeng.dao.GoodsDao;
import com.liangyaofeng.entity.Goods;
import com.liangyaofeng.entity.GoodsMax;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class GoodsDaoTest {

    @Autowired
    GoodsDao goodsDao;

//    @Test
//    public void selectmax(){
//        GoodsMax list=goodsDao.selectmaxgid();
//        System.out.println(list);
//    }


    @Test
    public void test(){
        List<Goods> list=goodsDao.selectAllGoods("荣耀");
        System.out.println(list);
    }

    @Test
    public void add(){
        Goods goods=new Goods();
        goods.setGid("18112201053");
        goods.setCid("201801");
        goods.setGname("荣耀10");
        goods.setGimg("rongyao1.jpg");
        goods.setGtype("手机");
        goods.setGprice(3000.99);
        goods.setGexplain("限时优惠400元+赠228元礼包：A2手环+荣耀耳机；送双倍积分（积分可抵现），现货速发");
        goods.setGcoding("20181107001");
        goods.setColour("幻夜黑");
        goods.setVersions("全网通6GB+64GB");
        goods.setDetails("GT游戏加速 AIS手持夜景 AI摄影手机 6GB+64GB 幻影蓝 全网通 双卡双待");
        goods.setStock(289);
        goods.setGstate("上架");
        goods.setAid(20181007);

        System.out.println(goodsDao.addGoods(goods));

    }

    @Test
    public void update(){
        Goods goods=new Goods();

        goods.setGid("18112201053");
        goods.setCid("201801");
        goods.setGname("荣耀畅享10plus");
        goods.setGimg("rongyao5.jpg");
        goods.setGtype("手机");
        goods.setGprice(3200);
        goods.setGexplain("限时优惠400元+赠228元礼包：A2手环+荣耀耳机；送双倍积分（积分可抵现），现货速发");
        goods.setGcoding("20181107001");
        goods.setColour("幻夜黑");
        goods.setVersions("全网通6GB+64GB");
        goods.setDetails("GT游戏加速 AIS手持夜景 AI摄影手机 6GB+64GB 幻影蓝 全网通 双卡双待");
        goods.setStock(200);
        goods.setGstate("上架");
        goods.setAid(20181007);

        System.out.println(goodsDao.updateGoods(goods));

    }


    @Test
    public void pager(){
        System.out.println(goodsDao.getGoodsPager(0,5,"荣耀","电脑","星空"));
    }


    @Test
    public void count(){
        System.out.println(goodsDao.getGoodsCount("荣耀","电脑","星空"));
    }


}
