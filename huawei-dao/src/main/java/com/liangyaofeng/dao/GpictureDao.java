package com.liangyaofeng.dao;

import com.liangyaofeng.entity.Gpicture;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GpictureDao {

    List<Gpicture> selectGpicturebygid(@Param("gid")String gid);



}
