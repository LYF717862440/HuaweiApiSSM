package com.liangyaofeng.controller;

import com.liangyaofeng.common.R;
import com.liangyaofeng.entity.Goods;
import com.liangyaofeng.entity.NoteResult;
import com.liangyaofeng.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.NoSuchAlgorithmException;
import java.util.List;

@Controller
@RequestMapping("goods")
public class GoodsController {

    @Autowired
    GoodsService goodsService;


    @RequestMapping("/goodsInfopage")
    @ResponseBody
    public R goodsInfopage(@RequestParam(defaultValue ="1")int param1,@RequestParam(defaultValue = "5")int param2,String gname,String gtype,String colour){
        return R.ok(goodsService.getGoodsPager(param1,param2,gname,gtype,colour));
    }

    @RequestMapping("/goodscount")
    @ResponseBody
    public R goodscount(String gname,String gtype,String colour){
        return R.ok(goodsService.getGoodsCount(gname,gtype,colour));
    }

    @RequestMapping("/selectbyid")
    @ResponseBody
    public R selectbyid(String gid){
        return  R.ok(goodsService.selectgoodsBygid(gid));
    }

//    @RequestMapping("/selectmaxloginId")
//    @ResponseBody
//    public R selectmaxloginId(){
//        return  R.ok(goodsService.selectmaxgid());
//    }



    @RequestMapping("/add")
    @ResponseBody
    public R add(Goods goods){
        return  R.ok(goodsService.addGoods(goods));
    }

    @RequestMapping("/update")
    @ResponseBody
    public R update(Goods goods){
        return  R.ok(goodsService.updateGoods(goods));
    }

    @RequestMapping("/delete")
    @ResponseBody
    public R delete(String gid){
        return  R.ok(goodsService.deleteGoodsbyGid(gid));
    }

    @RequestMapping("/deletelist")
    @ResponseBody
    public R deletelist(@RequestBody List<String> gids){
        return R.ok(goodsService.deletegoodsbyList(gids));
    }


    //22.下载附件，导出Excel,csv
    @RequestMapping("/pushcsv")
    @ResponseBody
    public void pushcsv(HttpServletResponse response) throws IOException {

        //POI
        //response.setContentType("text/html;charset=utf-8");
        //response.setCharacterEncoding("utf-8");
        response.setHeader("Content-Type","application/octet-stream;charset=utf-8");
        response.setHeader("Content-Disposition","attachment;filename=goods.csv");
        PrintWriter out = response.getWriter();
        //加上bom头,解决excel打开乱码问题
        byte[] bomStrByteArr = new byte[] { (byte) 0xef, (byte) 0xbb, (byte) 0xbf };
        String bomStr = new String(bomStrByteArr, "UTF-8");
        out.write(bomStr);

        List<Goods> list=goodsService.selectAllGoods("");

        StringBuffer str=new StringBuffer("");

        str.append("商品编号,分类编号,商品名称,商品图片,商品类型,价格,商品说明,商品编码,颜色,版本," +
                "详细描述,库存,状态,上货时间,管理员id\r\n");
        for (Goods goods:list) {
            str.append(goods.getGid()+","+goods.getCid()+","+goods.getGname()+","+goods.getGimg()+","+goods.getGtype()+","+goods.getGprice()+","+goods.getGexplain()+","+goods.getGcoding()+","
                    +goods.getColour()+"," +goods.getVersions()+","+goods.getDetails()+","+goods.getStock()+","+goods.getGstate()+","+goods.getLoadingtime()+","+goods.getAid()+"\r\n");
        }
        response.getWriter().write(str.toString());
    }


}
