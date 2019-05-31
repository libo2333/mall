package com.springboot.controller.wx.login;

import com.springboot.bean.ResponseVO;
import com.springboot.bean.UserBean.User;
import com.springboot.service.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/wx/auth")
public class AuthController {
    @Autowired
    UserService userService;
    @RequestMapping("login_by_weixin")
    public ResponseVO login_by_weixin(@RequestParam("code") String code ) {
        /*与注册时存入数据库的数据比较*/
        User user = userService.queryLoginUser(code);
        if(null!=user){
            return new ResponseVO<>(user,"成功",1);
        }
        return new ResponseVO<>(null, "错误", -1);
    }

    @RequestMapping("login")
    public ResponseVO login() {
        return new ResponseVO<>(null, "参数值不对", 402);
    }
    @RequestMapping("logout")
    public ResponseVO logout(){
        return new ResponseVO<>(null, "参数值不对", 402);
    }
    @RequestMapping("register")
    public ResponseVO register(){
        return new ResponseVO<>(null, "参数值不对", 402);

    }
    @RequestMapping("reset")
    public ResponseVO reset(){
        return new ResponseVO<>(null, "参数值不对", 402);

    }
    @RequestMapping("regCaptcha")
    public ResponseVO regCaptcha(){
        return new ResponseVO<>(null, "参数值不对", 402);

    }
    @RequestMapping("bindPhone")
    public ResponseVO bindPhone(){
        return new ResponseVO<>(null, "参数值不对", 402);

    }

}
