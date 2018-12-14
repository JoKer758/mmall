package com.mmall.service;

import com.mmall.common.ServerResponse;
import com.mmall.pojo.User;

/**
 * Created by joker on 2018/12/10.
 */
public interface IUserService {
    ServerResponse<User> login(String username, String password);

    ServerResponse<User> getInformation(Integer userId);


}
