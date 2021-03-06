package com.liangyaofeng.service.Impl;

import com.liangyaofeng.common.NoteUtil;
import com.liangyaofeng.dao.UsersDao;
import com.liangyaofeng.entity.NoteResult;
import com.liangyaofeng.entity.Users;
import com.liangyaofeng.service.UsersServie;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;
import java.util.List;

@Service
public class UsersServiceImpl implements UsersServie {


    @Autowired
    UsersDao usersDao;


    public NoteResult regist(String loginId, String password) throws NoSuchAlgorithmException {
        NoteResult result = new NoteResult();
        //检测用户名是否被占用
        Users hash_user=usersDao.selectUsersbyloginId(loginId);
        if(hash_user!=null){
            result.setStatus(1);
            result.setMsg("用户名已被占用");
            return  result;
        }
        Users user = new Users();
        user.setLoginId(loginId);
        String md5_pwd = NoteUtil.md5(password);
        user.setPassword(md5_pwd);
        //调用userDao保存
        usersDao.addUsers(user);
        result.setStatus(0);
        result.setMsg("注册成功");
        return result;
    }

    public NoteResult checkLogin(String loginId, String password) throws NoSuchAlgorithmException {
        NoteResult result = new NoteResult();
        Users users = usersDao.selectUsersbyloginId(loginId);
        if(users==null){
            result.setStatus(1);
            result.setMsg("用户名不存在");
            return result;
        }
        //将用户输入的pwd密码加密
        String md5_pwd=NoteUtil.md5(password);
        //与数据库密码比对
        if(!users.getPassword().equals(md5_pwd)){
            result.setStatus(2);
            result.setMsg("密码不正确");
            return  result;
        }
        result.setStatus(0);
        result.setMsg("用户名和密码正确");
        result.setData(users.getLoginId());//返回loginId
        return  result;
    }




    public List<Users> selectAllUsers(String loginId, String uname) {
        if (StringUtils.isEmpty(loginId)){
            loginId=null;
        }
        if (StringUtils.isEmpty(uname)){
            uname=null;
        }
        return usersDao.selectAllUsers();
    }

    public List<Users> selectAllUsers() {
        List<Users> list=usersDao.selectAllUsers();
        return list;
    }

    public Users selectUsersbyloginId(String loginId) {
        Users users=usersDao.selectUsersbyloginId(loginId);
        return users;
    }

    public Users selectuersbyid(String uid) {
        Users users=usersDao.selectuersbyid(uid);
        return users;
    }

    public boolean addUsers(Users users) {
        return usersDao.addUsers(users);
    }



    public boolean updateUsers(Users users) {
        return usersDao.updateUsers(users);
    }

    public boolean deleteUsersbyloginId(String loginId) {
        return usersDao.deleteUsersbyloginId(loginId);
    }

    public boolean deleteUsersbyList(List<String> loginIds) {
        if(loginIds==null||loginIds.size()<=0) {
            return false;
        }
        return usersDao.deleteUsersbyList(loginIds);
    }

    public List<Users> getUsersPager(int pageNO, int size,String loginId,String uname) {
        if (StringUtils.isEmpty(loginId)){
            loginId=null;
        }
        if (StringUtils.isEmpty(uname)){
            uname=null;
        }
        int skip=(pageNO-1)*size;
        return usersDao.getUsersPager(skip,size,loginId,uname);
    }

    public int getUsersCount(String loginId,String uname) {
        if (StringUtils.isEmpty(loginId)){
            loginId=null;
        }
        if (StringUtils.isEmpty(uname)){
            uname=null;
        }
        return usersDao.getUsersCount(loginId,uname);
    }
}
