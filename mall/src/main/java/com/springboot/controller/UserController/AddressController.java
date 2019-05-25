package com.springboot.controller.UserController;

import com.springboot.bean.Data;
import com.springboot.bean.PageDetail;
import com.springboot.bean.ResponseVO;
import com.springboot.bean.UserBean.Address;
import com.springboot.service.UserService.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("address")
public class AddressController {

    @Autowired
    AddressService addressService;
    @Autowired
    Data data;

    @RequestMapping("list")
    @ResponseBody
    public ResponseVO address(PageDetail pageDetail,String userId,String name){
        pageDetail.setOffset();
        List<Address> addressList = addressService.queryAddressList(pageDetail,userId,name);
        if (addressList.isEmpty()&&addressList==null){
            return new ResponseVO(null, "fail", 404);
        }else {
            int total = addressService.queryAddressCount(userId,name);
            data.setTotal(total);
            data.setItems(addressList);
            return new ResponseVO(data,"ok",0);
        }
    }
}
