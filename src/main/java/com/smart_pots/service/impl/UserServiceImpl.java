package com.smart_pots.service.impl;

import com.smart_pots.dao.UserDao;
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
    public String signUp(UserDTO userDTO) {
        System.out.println(userDTO.getUser_name());
        int result = 0;
        UserDTO userDTO1;
        userDTO1 =userDao.ifNameExist(userDTO.getUser_name());
        UserDTO userDTO2;
        userDTO2 = userDao.ifPhoneNumberExist(userDTO.getUser_phone_number());
        UserDTO userDTO3;
        userDTO3 = userDao.ifEmailExist(userDTO.getUser_email());
        System.out.println(userDTO.getUser_name());
        if(userDTO1!=null){
            result+=1;
        }
        if(userDTO2!=null){
            result+=10;
        }
        if(userDTO3!=null){
            result+=100;
        }

        if(result==0){
            userDao.signUp(userDTO.getUser_name(),userDTO.getUser_password(),userDTO.getUser_sex(),userDTO.getUser_age(),userDTO.getUser_phone_number(),userDTO.getUser_email());
        }
        String s = String.valueOf(result);
        return s;
    }

    @Override
    public int login(UserDTO userDTO) {
        if(userDao.login(userDTO.getUser_name(),userDTO.getUser_password())!=null){
            return 0;
        }
        return 1;
    }

    @Override
    public List<UserDTO> getAll() {
        return null;
    }
}
