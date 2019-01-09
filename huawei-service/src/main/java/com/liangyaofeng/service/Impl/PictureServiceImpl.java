package com.liangyaofeng.service.Impl;

import com.liangyaofeng.dao.PictureDao;
import com.liangyaofeng.entity.Picture;
import com.liangyaofeng.service.PictureService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PictureServiceImpl implements PictureService {

    @Autowired
    PictureDao pictureDao;


    public List<Picture> selectbyimgname(String imgname,String gid) {
        if(StringUtils.isEmpty(imgname)){
            imgname=null;
        }
        if(StringUtils.isEmpty(gid)){
            gid=null;
        }
        List<Picture> list=pictureDao.selectbyimgname(imgname,gid);
        return list;
    }

    public List<Picture>  selectPicturebygid(String gid) {
        List<Picture>  picture=pictureDao.selectPicturebygid(gid);
        return picture;
    }

    public List<Picture> getPicturePager(int skip, int size, String imgname, String gid) {
        if(StringUtils.isEmpty(imgname)){
            imgname=null;
        }
        if(StringUtils.isEmpty(gid)){
            gid=null;
        }
        List<Picture> list=pictureDao.getPicturePager(skip,size,imgname,gid);
        return list;
    }
}
