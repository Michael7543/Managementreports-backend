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
@Table(name ="users_roles")
public class UserRoles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(fetch = FetchType.LAZY , targetEntity = Users.class , optional = false)
    @JoinColumn(name = "user_id" ,referencedColumnName = "id")
    private Users users;

    @ManyToOne(fetch = FetchType.LAZY , targetEntity = Roles.class , optional = false)
    @JoinColumn(name = "rol_id" , referencedColumnName = "id")
    private Roles roles;

}
