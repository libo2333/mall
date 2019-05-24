package com.springboot.service;

import com.springboot.bean.PictureData;
import com.springboot.mapper.StorageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StorageServiceImpl implements StorageService {

    @Autowired
    StorageMapper storageMapper;

    @Override
    public int createStorage(PictureData data) {
        int ret = storageMapper.insertStorage(data);
        return ret;
    }

    @Override
    public PictureData queryStorageByKey(PictureData data) {
        data = storageMapper.selectStorageByKey(data);
        return data;
    }
}
