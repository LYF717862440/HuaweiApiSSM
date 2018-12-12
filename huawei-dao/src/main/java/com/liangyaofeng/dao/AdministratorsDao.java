package com.liangyaofeng.dao;

import com.liangyaofeng.entity.Administrators;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdministratorsDao {

     List<Administrators> selectAllAdmin();

     Administrators selectAllbyloginId(@Param("loginId") String loginId);

     boolean addAdministrators(Administrators administrators);

     boolean deleteAdministrators(@Param("loginId") String loginId);

     boolean deleteadminbyList(List<String> loginIds);

     boolean updateAdministrators(Administrators administrators);

     List<Administrators> getAdmnPager(@Param("skip") int skip,@Param("size") int size);

     int getadminCount();



}
