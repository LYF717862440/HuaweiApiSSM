package com.liangyaofeng.service;

import com.liangyaofeng.entity.Gpicture;

import java.util.List;

public interface GpictureService {

    List<Gpicture> selectGpicturebygid(String gid);

}
