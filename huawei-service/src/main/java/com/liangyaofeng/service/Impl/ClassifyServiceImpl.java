package com.liangyaofeng.service.Impl;

import com.liangyaofeng.dao.ClassifyDao;
import com.liangyaofeng.entity.Classify;
import com.liangyaofeng.service.ClassifyService;
import org.apache.commons.lang3.StringUtils;
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

    public Classify selectClassifybyid(String cid) {
        Classify classify=classifyDao.selectClassifybyid(cid);
        return classify;
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

    public boolean deleteClasifyBylist(List<String> cids) {
        if(cids==null||cids.size()<=0) {
            return false;
        }
        return classifyDao.deleteClasifyBylist(cids);
    }

    public List<Classify> getClassifyPager(int pageNO, int size,String sort,String series) {
        if (StringUtils.isEmpty(sort)){
            sort=null;
        }
        if (StringUtils.isEmpty(series)){
            series=null;
        }
        int skip=(pageNO-1)*size;
        return classifyDao.getClassifyPager(skip,size,sort,series);
    }

    public int getClassifyCount(String sort,String series) {
        if (StringUtils.isEmpty(sort)){
            sort=null;
        }
        if (StringUtils.isEmpty(series)){
            series=null;
        }
        return classifyDao.getClassifyCount(sort,series);
    }
}
