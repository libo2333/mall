package com.springboot.service.admin.Impl;

import com.springboot.bean.PictureData;
import com.springboot.bean.admin.Storage;
import com.springboot.mapper.admin.StorageMapper;
import com.springboot.service.admin.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class StorageServiceImpl implements StorageService {
    @Autowired
    StorageMapper storageMapper;

    @Override
    public List<Storage> queryAllStorage(int page, int limit, String sort, String order) {
        int offset=(page-1)*limit;
        return storageMapper.queryAllStorage(offset,limit,sort,order);
    }

    @Override
    public int insertStorage(MultipartFile file) {
        int i = storageMapper.insertStorage(file);
        return i;
    }
    @Override
    public int createStorage(PictureData data) {
        int ret = storageMapper.insertStoragePicture(data);
        return ret;
    }

    @Override
    public PictureData queryStorageByKey(PictureData data) {
        data = storageMapper.selectStorageByKey(data);
        return data;
    }
}
