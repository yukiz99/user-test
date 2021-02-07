package com.zhu.user.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zhu.user.dao.UserDAO;
import com.zhu.user.entity.ErrorEnum;
import com.zhu.user.entity.User;
import com.zhu.user.handler.MyException;
import com.zhu.user.util.PageUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@Service
public class UserService {

    @Resource
    private UserDAO userDAO;

    public PageUtil<User> getUserList(int pageNum, int pageSize,User searchUser){
        PageHelper.startPage(pageNum,pageSize);
        List<User> list=userDAO.getUserList(searchUser);
        PageUtil<User> page=PageUtil.trans(list);
        return page;
    }

    public User getUserById(int id){
        return userDAO.getUserById(id);
    }

    public void insertUser(User user){
        user.setCreateTime(new Date());
        int num=userDAO.insertUser(user);
        if(num!=1){
            throw new MyException(ErrorEnum.SERVICE_ERROR);
        }
    }

    public void updateUser(User user){
        int num=userDAO.updateUser(user);
        if(num!=1){
            throw new MyException(ErrorEnum.SERVICE_ERROR);
        }
    }

    public void deleteUser(int id){
        int num=userDAO.deleteUser(id);
        if(num!=1){
            throw new MyException(ErrorEnum.SERVICE_ERROR);
        }
    }


}
