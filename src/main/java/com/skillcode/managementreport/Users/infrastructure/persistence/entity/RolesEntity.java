package com.skillcode.managementreport.Users.infrastructure.persistence.entity;

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
@Table(name = "roles",schema = "management_report", indexes = {
        @Index(name = "idx_role_name", columnList = "role_name")
})
public class RolesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "role_name", length = 30, nullable = false, unique = true)
    private String roleName;
    @Column(name = "description", length = 100)
    private String description;

    @OneToMany(mappedBy = "rolesEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UserRolesEntity> userWhitRole = new ArrayList<>();

    @OneToMany(mappedBy = "rolesEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ReceptorEntity> receptorEntities = new ArrayList<>();
}
