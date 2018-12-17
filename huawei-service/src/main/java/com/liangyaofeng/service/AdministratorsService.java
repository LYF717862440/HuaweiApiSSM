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

    Administrators selectAdminbyid(String aid);

    boolean addAdministrators(Administrators administrators);

    boolean deleteAdministrators(String loginId);

    boolean updateAdministrators(Administrators administrators);

    boolean deleteadminbyList(List<String> loginIds);

    List<Administrators> getAdmnPager( int pageNO, int size,String loginId,String aname,String jop);

    int getadminCount(String loginId,String aname,String jop);


}
