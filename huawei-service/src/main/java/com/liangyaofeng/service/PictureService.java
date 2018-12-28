package com.liangyaofeng.service;

import com.liangyaofeng.entity.Picture;

import java.util.List;

public interface PictureService {

    List<Picture> selectAllPicture();

    List<Picture>  selectPicturebygid(String gid);
}
