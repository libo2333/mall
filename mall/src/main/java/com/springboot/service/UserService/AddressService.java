package com.springboot.service.UserService;

import com.springboot.bean.PageDetail;
import com.springboot.bean.UserBean.Address;

import java.util.List;

public interface AddressService {
    List<Address> queryAddressList(PageDetail pageDetail,String userId,String name);
}
