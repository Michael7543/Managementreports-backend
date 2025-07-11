package com.skillcode.managementreport.Users.Entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "detail_info")
public class DetailInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String function_detail;
    private String activity;
    private String sub_activity;
    private String stategy;
    private String type_place;
    private String administration_zona;
    private String public_space;
    private Integer latitude;
    private Integer longitude;
    private String direction;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Users.class , optional = false)
    @JoinColumn(name = "user_id" , referencedColumnName = "id")
    private Users user;


}
