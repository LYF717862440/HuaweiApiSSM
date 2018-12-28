package com.liangyaofeng.service.Impl;

import com.liangyaofeng.dao.PictureDao;
import com.liangyaofeng.entity.Picture;
import com.liangyaofeng.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PictureServiceImpl implements PictureService {

    @Autowired
    PictureDao pictureDao;


    public List<Picture> selectAllPicture() {
        List<Picture> list=pictureDao.selectAllPicture();
        return list;
    }

    public List<Picture>  selectPicturebygid(String gid) {
        List<Picture>  picture=pictureDao.selectPicturebygid(gid);
        return picture;
    }
}
