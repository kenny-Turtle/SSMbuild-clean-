package com.zfj.controller;

import com.zfj.pojo.User;
import com.zfj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author zfj
 * @create 2019/12/5 19:43
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    //跳回登录页面
    @RequestMapping("toLogin")
    public String toLogin(){
        return "login";
    }

    //查询
    @RequestMapping("/queryUser")
    public String queryUser(String username, String password, Model model){
        User user = userService.queryUser(username);
        System.out.println(username);
        model.addAttribute("loginedname",username);
        if(user==null){
            model.addAttribute("nameError","用户名错误");
            return "login";
        }else{
            if(password.equals(user.getPassword())){
                return "allBook";
            }else{
                model.addAttribute("pwdError","密码错误");
                return "login";
            }
        }
    }
    //跳转至注册页面
    @RequestMapping("/toAddUser")
    public String toAddUser(){
        return "addUser";
    }

    //添加用户
    @RequestMapping("/addUser")
    public String addUser(User user,Model model){
        System.out.println(user);
        int i = userService.addUser(user);
        if(i>0){
            model.addAttribute("registSuccess","注册成功");
            return "redirect:/book/allBook";
        }
        else
            return "login";
    }

}
