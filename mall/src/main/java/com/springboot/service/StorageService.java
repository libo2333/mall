package com.springboot.service;

import com.springboot.bean.PictureData;

public interface StorageService {

    int createStorage(PictureData data);


    PictureData queryStorageByKey(PictureData data);
}
