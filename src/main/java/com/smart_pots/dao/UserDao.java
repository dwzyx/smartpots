package com.smart_pots.dao;

import com.smart_pots.model.UserDTO;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {
    UserDTO ifNameExist(String userName);
    UserDTO ifPhoneNumberExist(String userPhoneNumber);
    UserDTO ifEmailExist(String userEmail);
    UserDTO login(String userName,String userPassword);
    void signUp(String userName,String userPassword,int userSex,int userAge,String userPhoneNumber,String userEmail);
}
