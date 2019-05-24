package com.springboot.controller;

import com.springboot.Util.FileUploadUtil;
import com.springboot.bean.PictureData;
import com.springboot.bean.ResponseVO;
import com.springboot.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@Controller
@RequestMapping("storage")
public class StorageController {

    @Autowired
    StorageService storageService;

    @RequestMapping("create")
    @ResponseBody
    public ResponseVO create(MultipartFile file, HttpServletRequest request) throws IOException {
        /*StringBuilder stringBuilder = new StringBuilder();
        try {
            BufferedReader reader = request.getReader();
            char[] buff = new char[1024];
            int len;
            while ((len = reader.read(buff)) != -1){
                stringBuilder.append(buff,0,len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        String s = stringBuilder.toString();
        System.out.println(s);*/
        PictureData data = FileUploadUtil.uploadUtil(file, request);
        int ret = storageService.createStorage(data);
        if (ret==1){
            data = storageService.queryStorageByKey(data);
            return new ResponseVO(data,"ok",0);
        }else {
            return new ResponseVO(null,"fail",404);
        }
    }

    @RequestMapping("fetch/{path}")
    public void fetch(@PathVariable("path") String path, HttpServletResponse response){
        File file = new File("/upload/image/" + path);

        try (FileInputStream inputStream = new FileInputStream(file);
             ServletOutputStream outputStream = response.getOutputStream()){
            byte[] b = new byte[2048];
            int length;
            while ((length = inputStream.read(b)) > 0){
                outputStream.write(b,0,length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
