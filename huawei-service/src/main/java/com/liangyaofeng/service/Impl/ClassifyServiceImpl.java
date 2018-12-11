package com.liangyaofeng.service.Impl;

import com.liangyaofeng.dao.ClassifyDao;
import com.liangyaofeng.entity.Classify;
import com.liangyaofeng.service.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClassifyServiceImpl implements ClassifyService {

    @Autowired
    ClassifyDao classifyDao;


    public List<Classify> selectAllClassify() {
        List<Classify> list=classifyDao.selectAllClassify();
        return list;
    }

    public boolean addClassify(Classify classify) {
        return classifyDao.addClassify(classify);
    }

    public boolean updateClassify(Classify classify) {
        return classifyDao.updateClassify(classify);
    }

    public boolean deleteClassify(String cid) {
        return classifyDao.deleteClassify(cid);
    }

    public List<Classify> getClassifyPager(int pageNO, int size) {
        int skip=(pageNO-1)*size;
        return classifyDao.getClassifyPager(skip,size);
    }

    public int getClassifyCount() {
        return classifyDao.getClassifyCount();
    }
}
