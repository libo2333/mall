package com.springboot.mapper.admin;

import com.springboot.bean.PictureData;
import com.springboot.bean.admin.Storage;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface StorageMapper {
    List<Storage> queryAllStorage(@Param("offset") int offset,
                                  @Param("limit")int limit,
                                  @Param("sort")String sort,
                                  @Param("order")String order);

    int insertStorage(MultipartFile file);
    int insertStoragePicture(PictureData data);

    PictureData selectStorageByKey(PictureData data);
}
