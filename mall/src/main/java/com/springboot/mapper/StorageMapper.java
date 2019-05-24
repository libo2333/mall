package com.springboot.mapper;

import com.springboot.bean.PictureData;

public interface StorageMapper {
    int insertStorage(PictureData data);

    PictureData selectStorageByKey(PictureData data);
}
