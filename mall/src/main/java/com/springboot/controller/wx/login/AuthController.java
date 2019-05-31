package com.springboot.controller.wx.login;

import com.springboot.bean.ResponseVO;
import com.springboot.bean.admin.LoginUser;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RequestMapping("/wx/auth")
public class AuthController {
    @RequestMapping("login_by_weixin")
    public ResponseVO login_by_weixin(@RequestBody LoginUser loginUser) {
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
