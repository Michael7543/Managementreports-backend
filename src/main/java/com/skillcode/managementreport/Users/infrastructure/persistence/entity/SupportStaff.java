package com.skillcode.managementreport.Users.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "support_staff",schema = "management_report")
public class SupportStaff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "staff_name", length = 255)
    private String staffName;

    @Column(name = "assignment_date", length = 255)
    private Date assignmentDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id",referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_user_apoyo"))
    private Users users;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "rol_id",referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_rol_apoyo"))
    private Roles roles;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "general_info_id", referencedColumnName = "id",foreignKey = @ForeignKey(name = "fk_general_info"))
    private GeneralInfo generalInfo;



}
