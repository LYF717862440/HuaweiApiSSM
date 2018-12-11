package com.liangyaofeng.service.Impl;

import com.liangyaofeng.common.NoteUtil;
import com.liangyaofeng.dao.AdministratorsDao;
import com.liangyaofeng.entity.Administrators;
import com.liangyaofeng.entity.NoteResult;
import com.liangyaofeng.service.AdministratorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.security.NoSuchAlgorithmException;
import java.util.List;

@Service
public class AdministratorsServiceImpl implements AdministratorsService{

    @Autowired
    AdministratorsDao administratorsDao;


    public NoteResult checkLogin(String loginId, String password) throws NoSuchAlgorithmException {
        NoteResult result = new NoteResult();
        Administrators administrators = administratorsDao.selectAllbyloginId(loginId);
        if(administrators==null){
            result.setStatus(1);
            result.setMsg("用户名不存在");
            return result;
        }
        //将用户输入的pwd密码加密
        String md5_pwd=NoteUtil.md5(password);
        //与数据库密码比对
        if(!administrators.getPassword().equals(password)){
            result.setStatus(2);
            result.setMsg("密码不正确");
            return  result;
        }
        result.setStatus(0);
        result.setMsg("用户名和密码正确");
        result.setData(administrators.getLoginId());//返回loginId
        return  result;
    }



    public List<Administrators> selectAllAdmin() {
        List<Administrators> list=administratorsDao.selectAllAdmin();
        return list;
    }

    public Administrators selectAllbyloginId(String loginId) {
        Administrators administrators=administratorsDao.selectAllbyloginId(loginId);
        return administrators;
    }

    public boolean addAdministrators(Administrators administrators) {
        return administratorsDao.addAdministrators(administrators);
    }

    public boolean deleteAdministrators(String loginId) {
        return administratorsDao.deleteAdministrators(loginId);
    }

    public boolean updateAdministrators(Administrators administrators) {
        return administratorsDao.updateAdministrators(administrators);
    }

    public List<Administrators> getAdmnPager(int pageNO, int size) {
        int skip=(pageNO-1)*size;
        return administratorsDao.getAdmnPager(skip,size);
    }

    public int getadminCount() {
        return administratorsDao.getadminCount();
    }
}
