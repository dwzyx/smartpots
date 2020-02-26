package com.smart_pots.service;

import com.alibaba.fastjson.JSONObject;
import com.smart_pots.model.*;

import java.util.List;

public interface UserService {
    /**
     * @param userDTO
     * @return
     */
    public JSONObject login (UserLoginDTO userDTO);

    /**
     * @param userDTO
     * @return 返回注册信息0表示注册成功，1表示用户名重复，10表示电话号码重复，100表示邮箱地址重复
     */
    public JSONObject signUp(UserDTO userDTO);

    /**
     * @return UserDTO的所有用户信息
     */
    List<UserDTO> getAll();

}
