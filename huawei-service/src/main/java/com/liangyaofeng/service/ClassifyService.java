package com.liangyaofeng.service;

import com.liangyaofeng.entity.Classify;

import java.util.List;

public interface ClassifyService {

    List<Classify> selectAllClassify();

    Classify selectClassifybyid(String cid);

    boolean addClassify(Classify classify);

    boolean updateClassify(Classify classify);

    boolean deleteClassify(String cid);

    boolean deleteClasifyBylist(List<String> cids);

    List<Classify> getClassifyPager( int pageNO, int size,String sort,String series);

    int getClassifyCount(String sort,String series);

}
