package com.liangyaofeng.dao;

import com.liangyaofeng.entity.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UsersDao {

    List<Users> selectAllUsersbytwo(@Param("uid") long uid, @Param("loginId") String loginId, @Param("uname") String uname);

    List<Users> selectAllUsers();

    Users selectUsersbyloginId(@Param("loginId") String loginId);

    boolean addUsers(Users users);

    boolean updateUsers(Users users);

    boolean deleteUsersbyloginId(String loginId);

    boolean deleteUsersbyList(List<String> loginIds);

    List<Users> getUsersPager(@Param("skip") int skip,@Param("size") int size);

    int getUsersCount();



}
