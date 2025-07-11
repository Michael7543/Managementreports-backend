package com.skillcode.managementreport.Users.Entities;

import jakarta.persistence.*;
import lombok.*;


@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users")
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String lastname;
    private String identity_card;
    private int phone;
    private String email;
    private String password;



}
