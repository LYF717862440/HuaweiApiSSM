package com.liangyaofeng.service;

import com.liangyaofeng.entity.NoteResult;
import com.liangyaofeng.entity.Users;

import java.security.NoSuchAlgorithmException;
import java.util.List;

public interface UsersServie {


//    登录验证
    public NoteResult checkLogin(String loginId, String password) throws NoSuchAlgorithmException;

    List<Users> selectAllUsers(String loginId, String uname);

    List<Users> selectAllUsers();

    Users selectUsersbyloginId(String loginId);

    Users selectuersbyid(String uid);

    boolean addUsers(Users users);

    boolean updateUsers(Users users);

    boolean deleteUsersbyloginId(String loginId);

    boolean deleteUsersbyList(List<String> loginIds);


    List<Users> getUsersPager( int pageNO, int size,String loginId,String uname);

    int getUsersCount(String loginId,String uname);


}
