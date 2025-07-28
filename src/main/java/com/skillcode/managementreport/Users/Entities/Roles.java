package com.skillcode.managementreport.Users.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "roles", indexes = {
        @Index(name = "idx_role_name", columnList = "role_name")
})
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "role_name", length = 20, nullable = false)
    private String roleName;
    @Column(name = "description", length = 100)
    private String description;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UserRoles> userWhitRole = new ArrayList<>();
}
