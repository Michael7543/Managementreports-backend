package com.skillcode.managementreport.GeneralInfo.Entities;

import com.skillcode.managementreport.Users.Entities.Users;
import jakarta.persistence.*;
import lombok.*;

import java.sql.Time;
import java.sql.Timestamp;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "general_info")
public class GeneralInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String order_service;
    private Timestamp fecha;
    private Time time_start;
    private Time time_end;
    private String code;
    private String receiver;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Users.class , optional = false)
    @JoinColumn(name = "user_id" , referencedColumnName = "id")
    private Users user;


}
