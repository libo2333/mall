package com.springboot.controller.wx.login;

import com.springboot.bean.ResponseVO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("wx/coupon")
public class RecieveController {

    @RequestMapping("recieve")
    public ResponseVO login(@RequestBody int couponId) {

        return new ResponseVO<>(null, "请登录", 0);
    }
    @RequestMapping("list")
    public ResponseVO list(@RequestBody int couponId) {

        return new ResponseVO<>(null, "请登录", 0);
    }
    @RequestMapping("mylist")
    public ResponseVO mylist(@RequestBody int couponId) {

        return new ResponseVO<>(null, "请登录", 0);
    }
    @RequestMapping("selectlist")
    public ResponseVO selectlist(@RequestBody int couponId) {

        return new ResponseVO<>(null, "请登录", 0);
    }
    @RequestMapping("exchange")
    public ResponseVO exchange(@RequestBody int couponId) {

        return new ResponseVO<>(null, "请登录", 0);
    }

}
