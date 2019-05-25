package com.springboot.controller.admin;


import com.springboot.Util.FileUploadUtil;
import com.springboot.bean.Data;
import com.springboot.bean.PictureData;
import com.springboot.bean.ResponseVO;
import com.springboot.bean.admin.Storage;
import com.springboot.service.admin.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

@Controller
public class AdminStorageController {
    @Autowired
    StorageService storageService;

    @RequestMapping(value = "storage/list", method = RequestMethod.OPTIONS)
    public void storageOption() {
    }
    @ResponseBody
    @RequestMapping(value = "storage/list", method = RequestMethod.GET)
    public ResponseVO storageList(@RequestParam("page") int page,
                                  @RequestParam("limit") int limit,
                                  @RequestParam("sort") String sort,
                                  @RequestParam("order") String order) {
        List<Storage> storages = storageService.queryAllStorage(page,limit,sort,order);
        return new ResponseVO(new Data<>( storages,storages.size()), "成功", 0);
    }
/*//    @RequestMapping(value = "storage/create")
//    @ResponseBody
//    public ResponseVO storageCreate(@RequestParam("file") MultipartFile file){
//        int i = storageService.insertStorage(file);
//        List<Storage> storages= (List<Storage>) file;
//        return (i==1? new ResponseVO(new Data<>(storages,1),"成功",0):
//        new ResponseVO(null,"失败",1));
//    }*/
    @RequestMapping("storage/create")
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
            PictureData data1 = storageService.queryStorageByKey(data);
            return new ResponseVO<PictureData>(data1,"成功",0);
        }else {
            return new ResponseVO(null,"fail",404);
        }
    }

    @RequestMapping("storage/fetch/{path}")
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
