package com.smart_pots.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.smart_pots.dao.UserDao;
import com.smart_pots.enumeration.StatusEnum;
import com.smart_pots.service.*;
import com.smart_pots.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;


    @Override
    public JSONObject signUp(UserDTO userDTO) {

        JSONObject jsonObject = new JSONObject();
        System.out.println(userDTO.getUser_name());
        int result = 0;
        UserDTO userDTO1;
        userDTO1 =userDao.ifNameExist(userDTO.getUser_name());
        UserDTO userDTO2;
        userDTO2 = userDao.ifPhoneNumberExist(userDTO.getUser_phone_number());
        UserDTO userDTO3;
        userDTO3 = userDao.ifEmailExist(userDTO.getUser_email());
        System.out.println(userDTO.getUser_name());
        if(userDao.ifNameExist(userDTO.getUser_name())!=null){
            result+=1;
        }
        if(userDao.ifPhoneNumberExist(userDTO.getUser_phone_number())!=null){
            result+=10;
        }
        if(userDao.ifEmailExist(userDTO.getUser_email())!=null){
            result+=100;
        }

        if(result==0){
            userDao.signUp(userDTO.getUser_name(),userDTO.getUser_password(),userDTO.getUser_sex(),userDTO.getUser_age(),userDTO.getUser_phone_number(),userDTO.getUser_email());
        }
        Integer integer = new Integer(result);

        jsonObject.put("result",integer);;
        return jsonObject;
    }

    @Override
    public JSONObject login(UserLoginDTO userDTO) {
        JSONObject jsonObject = new JSONObject();
        if(userDao.login(userDTO.getUser_name(),userDTO.getUser_password())!=null){
            StatusEnum.getMessageJson(StatusEnum.SUCCESS,jsonObject);
            return jsonObject;
        }
        StatusEnum.getMessageJson(StatusEnum.FAILED,jsonObject);
        return jsonObject;
    }

    @Override
    public List<UserDTO> getAll() {
        return null;
    }
}
