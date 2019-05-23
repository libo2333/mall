package com.springboot.service.UserService;

import com.springboot.bean.PageDetail;
import com.springboot.bean.UserBean.FootPrint;

import java.util.List;

public interface FootPrintService {
    List<FootPrint> queryFootPrintList(PageDetail pageDetail, String userId, String goodsId);
}
