package com.smart_pots.controller;

import com.alibaba.fastjson.JSONObject;
import com.smart_pots.enumeration.StatusEnum;
import com.smart_pots.model.*;
import com.smart_pots.service.*;
import com.google.gson.Gson;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    private String answer = null;
    private Gson gson = new Gson();
    private JSONObject jsonObject = new JSONObject();

    private final
    UserService userService;//addsfsd

    public UserController(UserService userService) {
        this.userService = userService;
    }


    @PostMapping("/user/signUp")
    public String signUp(@RequestBody UserDTO userDTO){

        JSONObject jsonObject = userService.signUp(userDTO);

        System.out.println(jsonObject.toString());

        return jsonObject.toString();
    }

    @PostMapping(value = "/user/login", produces = "application/json;charset=UTF-8")
    public String login(@RequestBody UserLoginDTO userDTO){


        JSONObject jsonObject = userService.login(userDTO);

        System.out.println(jsonObject.toString());
        return jsonObject.toString();
    }


    @PostMapping("/user/getAll")
    public String getAll(@RequestParam("id") int id){
        System.out.println(id);
        jsonObject.replace("result",id);
        return jsonObject.toString();
    }
}
