package com.liangyaofeng.dao;

import com.liangyaofeng.entity.Classify;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClassifyDao {

    List<Classify> selectAllClassify();

    boolean addClassify(Classify classify);

    boolean updateClassify(Classify classify);

    boolean deleteClassify(String cid);

    boolean deleteClasifyBylist(List<String> cids);

    List<Classify> getClassifyPager(@Param("skip") int skip,@Param("size") int size);

    int getClassifyCount();


}
