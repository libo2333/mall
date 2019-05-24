package com.springboot.Util;

import com.springboot.bean.PictureData;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

public class FileUploadUtil {
    public static PictureData uploadUtil(MultipartFile file, HttpServletRequest req) throws  IOException {
        PictureData imageInfo = new PictureData();
        //获取上传文件名
        String fileName = file.getOriginalFilename();
        imageInfo.setName(fileName);

        //给文件名前加UUID
        String uuid = UuidGenerator.uuid();
        fileName = uuid + fileName;
        imageInfo.setKey(fileName);
        imageInfo.setUrl("http://localhost/admin/storage/fetch/" + fileName);

        //指定文件上传目录，如果不存在则创建
        File uploadFile = new File("/upload/image/" + fileName);

        if (!uploadFile.getParentFile().exists()) {
            uploadFile.getParentFile().mkdirs();
            uploadFile.createNewFile();
        }

        file.transferTo(uploadFile);

        imageInfo.setSize(file.getSize());
        imageInfo.setType(file.getContentType());

        return imageInfo;
    }
}
