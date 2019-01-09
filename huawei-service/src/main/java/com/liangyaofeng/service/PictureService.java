package com.liangyaofeng.service;

import com.liangyaofeng.entity.Picture;

import java.util.List;

public interface PictureService {

    List<Picture> selectbyimgname(String imgname,String gid);

    List<Picture>  selectPicturebygid(String gid);


    List<Picture> getPicturePager( int skip, int size,String imgname,String gid);



}
