package com.springboot.service.admin;

import com.springboot.bean.PictureData;
import com.springboot.bean.admin.Storage;

import java.util.List;

public interface StorageService {
    List<Storage> queryAllStorage(int page, int limit, String sort, String order);

    int createStorage(PictureData data);
    PictureData queryStorageByKey(PictureData data);

    int delete(Storage storage);

    int update(Storage storage);
}
