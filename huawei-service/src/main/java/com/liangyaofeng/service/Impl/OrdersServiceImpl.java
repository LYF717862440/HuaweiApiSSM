package com.liangyaofeng.service.Impl;

import com.liangyaofeng.dao.OrdersDao;
import com.liangyaofeng.entity.Orders;
import com.liangyaofeng.service.OrdersService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService {


    @Autowired
    OrdersDao ordersDao;



    public List<Orders> selectOrdersAll(String uid) {
        List<Orders> list=ordersDao.selectOrdersAll(uid);
        return list;
    }

    public List<Orders> selectOrdersByordersid(String buyordersid) {
        List<Orders> list=ordersDao.selectOrdersByordersid(buyordersid);
        return list;
    }

    public boolean addAllOrders(List<Integer> ids) {
        return ordersDao.addAllOrders(ids);
    }

    public boolean updateOrders(Orders orders) {
        return ordersDao.updateOrders(orders);
    }

    public boolean updateOrdersByamount(Orders orders) {
        return ordersDao.updateOrdersByamount(orders);
    }


    public List<Orders> getOrdersPager(int pageNO, int size, String uid, String gid, String cname,String ostate) {
        if (StringUtils.isEmpty(uid)){
            uid=null;
        }
        if (StringUtils.isEmpty(gid)){
            gid=null;
        }
        if (StringUtils.isEmpty(cname)){
            cname=null;
        }
        if (StringUtils.isEmpty(ostate)){
            ostate=null;
        }
        int skip=(pageNO-1)*size;
        return ordersDao.getOrdersPager(skip,size,uid,gid,cname,ostate);
    }


    public int getOrdersCount(String uid, String gid, String cname,String ostate) {
        if (StringUtils.isEmpty(uid)){
            uid=null;
        }
        if (StringUtils.isEmpty(gid)){
            gid=null;
        }
        if (StringUtils.isEmpty(cname)){
            cname=null;
        }
        if (StringUtils.isEmpty(ostate)){
            cname=null;
        }
        return ordersDao.getOrdersCount(uid,gid,cname,ostate);
    }
}
