package com.zhu.user.controller;

import com.github.pagehelper.PageInfo;
import com.zhu.user.entity.Result;
import com.zhu.user.entity.User;
import com.zhu.user.service.UserService;
import com.zhu.user.util.PageUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("list/{pageSize}/{pageNum}")
    public PageUtil<User> getUserList(@PathVariable("pageNum")int pageNum, @PathVariable("pageSize")int pageSize,
                                       User seachUser){
           return userService.getUserList(pageNum,pageSize,seachUser);
    }

    @GetMapping("/{id}")
    public Result getUserById(@PathVariable("id") int id){
            User user=userService.getUserById(id);
            return Result.success("查询用户成功",user);
    }

    @PostMapping()
    public Result insertUser(@RequestBody User user){
        userService.insertUser(user);
        return Result.success("添加用户成功");
    }

    @PutMapping()
    public Result updateUser(@RequestBody User user){
        userService.updateUser(user);
        return Result.success("编辑用户成功");
    }

    @DeleteMapping("{id}")
    public Result deleteUser(@PathVariable("id") int id){
        userService.deleteUser(id);
        return Result.success("删除用户成功");
    }


}
