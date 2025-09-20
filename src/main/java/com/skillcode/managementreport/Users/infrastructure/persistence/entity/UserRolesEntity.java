package com.skillcode.managementreport.Users.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "users_roles",schema = "management_report", uniqueConstraints = @UniqueConstraint(columnNames = {"user_id", "rol_id"}))
public class UserRolesEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_user_role"), nullable = false)
    private UsersEntity usersEntity;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "rol_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_role_user"), nullable = false)
    private RolesEntity rolesEntity;

    private boolean active = true;
}
