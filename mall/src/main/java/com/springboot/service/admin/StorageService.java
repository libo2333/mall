package com.springboot.service.admin;

import com.springboot.bean.PictureData;
import com.springboot.bean.admin.Storage;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
public interface StorageService {
    List<Storage> queryAllStorage(int page, int limit, String sort, String order);

    int insertStorage(MultipartFile file);
    int createStorage(PictureData data);
    PictureData queryStorageByKey(PictureData data);
}
