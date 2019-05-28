package com.springboot.controller.admin;


import com.springboot.Util.DateUtils;
import com.springboot.Util.FileUploadUtil;
import com.springboot.bean.Data;
import com.springboot.bean.PictureData;
import com.springboot.bean.ResponseVO;
import com.springboot.bean.admin.Storage;
import com.springboot.service.admin.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.ParseException;
import java.util.List;
@RequestMapping("admin")
@RestController
public class StorageController {
    @Autowired
    StorageService storageService;

    @ResponseBody
    @RequestMapping(value = "storage/list", method = RequestMethod.GET)
    public ResponseVO storageList(@RequestParam("page") int page,
                                  @RequestParam("limit") int limit,
                                  @RequestParam("sort") String sort,
                                  @RequestParam("order") String order) {
        List<Storage> storages = storageService.queryAllStorage(page,limit,sort,order);
        return new ResponseVO<>(new Data<>( storages,storages.size()), "成功", 0);
    }
    @RequestMapping("storage/create")
    @ResponseBody
    public ResponseVO create(MultipartFile file) throws IOException {
        PictureData data = FileUploadUtil.uploadUtil(file);
        int ret = storageService.createStorage(data);
        if (ret==1){
            PictureData data1 = storageService.queryStorageByKey(data);
            return new ResponseVO<>(data1,"成功",0);
        }else {
            return new ResponseVO<>(null,"fail",404);
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
    @RequestMapping("storage/update")
    @ResponseBody
    public ResponseVO storage_update(@RequestBody Storage storage) throws ParseException {
        storage.setUpdateTime(DateUtils.dateOfNow());
        if(storageService.update(storage)!=0){
            return new ResponseVO<>(storage,"成功",0);
        }else {
            return new ResponseVO<>(null,"失败",1);
        }
    }
    @RequestMapping("storage/delete")
    @ResponseBody
    public ResponseVO storage_delete(@RequestBody Storage storage){
        int i= storageService.delete(storage);
        if(i!=0) {
            return new ResponseVO<>(null,"成功",0);
        }else {
            return new ResponseVO<>(null,"失败",1);
        }
    }

}
