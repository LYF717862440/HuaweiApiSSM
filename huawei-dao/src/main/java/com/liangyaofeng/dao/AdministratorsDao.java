package com.liangyaofeng.dao;

import com.liangyaofeng.entity.Administrators;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AdministratorsDao {

     List<Administrators> selectAllAdmin();

     Administrators selectAllbyloginId(@Param("loginId") String loginId);

     Administrators selectAdminbyid(@Param("aid")String aid);

     boolean addAdministrators(Administrators administrators);

     boolean deleteAdministrators(@Param("loginId") String loginId);

     boolean deleteadminbyList(List<String> loginIds);

     boolean updateAdministrators(Administrators administrators);

     List<Administrators> getAdmnPager(@Param("skip") int skip,@Param("size") int size,@Param("loginId")String loginId,@Param("aname")String aname,@Param("jop")String jop);

     int getadminCount(@Param("loginId")String loginId,@Param("aname")String aname,@Param("jop")String jop);



}
