package com.liangyaofeng.dao;

import com.liangyaofeng.entity.Classify;
import com.sun.org.glassfish.external.probe.provider.annotations.ProbeParam;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ClassifyDao {

    List<Classify> selectAllClassify();

    Classify selectClassifybyid(@Param("cid")String cid);

    boolean addClassify(Classify classify);

    boolean updateClassify(Classify classify);

    boolean deleteClassify(String cid);

    boolean deleteClasifyBylist(List<String> cids);

    List<Classify> getClassifyPager(@Param("skip") int skip,@Param("size") int size,@Param("sort")String sort,@Param("series")String series);

    int getClassifyCount(@Param("sort")String sort,@Param("series")String series);


}
