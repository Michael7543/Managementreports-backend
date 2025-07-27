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
    @Column(name = "name")
    private String name;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "identity_card")
    private String identityCard;
    @Column(name = "phone")
    private int phone;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;



}
