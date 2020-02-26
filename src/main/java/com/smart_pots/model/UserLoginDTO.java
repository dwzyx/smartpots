package com.smart_pots.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class UserLoginDTO {
    private String user_name;
    private String user_password;
}
