package com.springboot.service.UserService;

import com.springboot.bean.PageDetail;
import com.springboot.bean.UserBean.Collect;

import java.util.List;

public interface CollectService {
    List<Collect> queryCollectList(PageDetail pageDetail, String userId, String valueId);
}
