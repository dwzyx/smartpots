package com.smart_pots;

import com.alibaba.fastjson.JSONObject;
import com.smart_pots.model.UserDTO;
import com.smart_pots.service.UserService;
import com.smart_pots.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.Objects;

@SpringBootTest
class SmartPotsApplicationTests {

    @Autowired

    UserService userService;
    @Test
    void test_01(){

        UserDTO userDTO = new UserDTO(0,"zyx","123456zyx",1,19,"11111111111","738667591@qq.com");
        try{
            System.out.println("in");
            String s = userService.signUp(userDTO);
            System.out.println(s);
        } catch(NullPointerException e) {
            System.out.println("null");
        }



    }

    @Test
    void contextLoads() {
    }

}
