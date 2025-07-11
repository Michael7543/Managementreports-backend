package com.skillcode.managementreport.Users.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsersDto {
    private long id;
    private String name;
    private String lastname;
    private String identity_card;
    private int phone;
    private String email;
    private String password;

}
