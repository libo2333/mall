package com.springboot.service.UserService.impl;

import com.springboot.bean.PageDetail;
import com.springboot.bean.UserBean.Address;
import com.springboot.mapper.UserMapper.AddressMapper;
import com.springboot.service.UserService.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressMapper addressMapper;

    @Override
    public List<Address> queryAddressList(PageDetail pageDetail,String userId,String name) {
        List<Address> addressList = addressMapper.selectAddress(pageDetail,userId,name);
        return addressList;
    }
}
