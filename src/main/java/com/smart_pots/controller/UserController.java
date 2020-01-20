package com.smart_pots.controller;

import com.alibaba.fastjson.JSONObject;
import com.smart_pots.enumeration.StatusEnum;
import com.smart_pots.model.*;
import com.smart_pots.service.*;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    private String answer = null;
    private Gson gson = new Gson();
    private JSONObject jsonObject = new JSONObject();

    private final
    UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }


//    @GetMapping(value = "/user/signUp", produces = "application/json;charset=UTF-8")
//    public String signUp(@RequestBody UserDTO userDTO){
//
//
//        String userInfo = userService.signUp(userDTO);
//        if(userInfo!=null){
//            return null;
//        }
//
//        jsonObject.replace("result", userInfo);
//
//        System.out.println(jsonObject.toString());
//
//        return jsonObject.toString();
//    }

    @GetMapping(value = "/user/login", produces = "application/json;charset=UTF-8")
    public String login(@RequestBody UserDTO userDTO){


        int userInfo = userService.login(userDTO);

        jsonObject.replace("result", userInfo);

        System.out.println(jsonObject.toString());
        return jsonObject.toString();
    }


}
