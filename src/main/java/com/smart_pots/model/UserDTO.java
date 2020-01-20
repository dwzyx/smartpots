package com.smart_pots.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter @Getter
@ToString
@AllArgsConstructor
public class UserDTO {

    private int user_id;
    private String user_name;
    private String user_password;
    private int user_sex;
    private int user_age;
    private String user_phone_number;
    private String user_email;


}
