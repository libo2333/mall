package com.springboot.service.SpreadService;

import com.springboot.bean.PageDetail;
import com.springboot.bean.SpreadBean.Ad;

import java.util.List;

public interface AdService {
    List<Ad> queryAdList(PageDetail pageDetail, String name, String content);
}
