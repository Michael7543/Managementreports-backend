package com.skillcode.managementreport.Users.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users",schema = "management_report", indexes = {
        @Index(name = "idx_user_email", columnList = "email")
})
public class UsersEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "first_name", length = 30)
    private String firstName;
    @Column(name = "last_name", length = 30)
    private String lastName;
    @Column(name = "identity_card", length = 10)
    private String identityCard;
    @Column(name = "phone", length = 11)
    private int phone;
    @Column(name = "email", length = 100, nullable = false, unique = true)
    private String email;
    @Column(name = "password", nullable = false)
    private String password;
    @Column(name = "active")
    private boolean active = true;

    @OneToMany(mappedBy = "usersEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UserRolesEntity> userRoleEntities = new ArrayList<>();

    @OneToMany(mappedBy = "emisor_user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<GeneralInfoEntity> userEmisor = new ArrayList<>();

    @OneToMany(mappedBy = "receptor_user", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<GeneralInfoEntity> userReceptor = new ArrayList<>();

    @OneToMany(mappedBy = "usersEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SupportStaffEntity> supportStaffEntities = new ArrayList<>();

    @OneToMany(mappedBy = "usersEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ReceptorEntity> receptorEntities = new ArrayList<>();

    @OneToMany(mappedBy = "usersEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SupervisorActivity> supervisorActivities = new ArrayList<>();
}
