package com.liangyaofeng.dao;

import com.liangyaofeng.entity.Picture;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PictureDao {

    List<Picture> selectAllPicture();

    List<Picture> selectPicturebygid(@Param("gid") String gid);
}
