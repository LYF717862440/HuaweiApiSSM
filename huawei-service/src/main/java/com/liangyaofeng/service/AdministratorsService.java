package com.liangyaofeng.service;

import com.liangyaofeng.entity.Administrators;
import com.liangyaofeng.entity.NoteResult;

import java.security.NoSuchAlgorithmException;
import java.util.List;

public interface AdministratorsService {

//    登录
    public NoteResult checkLogin(String loginId, String password) throws NoSuchAlgorithmException;

    List<Administrators> selectAllAdmin();

    Administrators selectAllbyloginId(String loginId);

    boolean addAdministrators(Administrators administrators);

    boolean deleteAdministrators(String loginId);

    boolean updateAdministrators(Administrators administrators);

    List<Administrators> getAdmnPager( int pageNO, int size);

    int getadminCount();


}
