package com.liangyaofeng.service.Impl;

import com.liangyaofeng.dao.GpictureDao;
import com.liangyaofeng.entity.Gpicture;
import com.liangyaofeng.service.GpictureService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GpictureServiceImpl implements GpictureService {


    @Autowired
    GpictureDao gpictureDao;




    public List<Gpicture> selectGpicturebygid(String gid) {
        if(StringUtils.isEmpty(gid)){
            gid=null;
        }
        List<Gpicture> list=gpictureDao.selectGpicturebygid(gid);
        return list;
    }
}
