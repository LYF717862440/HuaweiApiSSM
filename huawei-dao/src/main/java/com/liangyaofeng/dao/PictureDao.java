package com.liangyaofeng.dao;

import com.liangyaofeng.entity.Picture;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface PictureDao {

    List<Picture> selectbyimgname(@Param("imgname")String imgname,@Param("gid")String gid);

    List<Picture> selectPicturebygid(@Param("gid") String gid);

    List<Picture> getPicturePager(@Param("skip") int skip,@Param("size") int size,@Param("imgname")String imgname,@Param("gid")String gid);


}
