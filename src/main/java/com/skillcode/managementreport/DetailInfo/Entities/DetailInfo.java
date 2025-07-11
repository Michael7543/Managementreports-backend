package com.skillcode.managementreport.DetailInfo.Entities;

import com.skillcode.managementreport.Users.Entities.Users;
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
    private long id;
    private String function_detail;
    private String activity;
    private String sub_activity;
    private String stategy;
    private String type_place;
    private String administration_zona;
    private String public_space;
    private int latitude;
    private int longitude;
    private String direction;

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Users.class , optional = false)
    @JoinColumn(name = "user_id" , referencedColumnName = "id")
    private Users user;


}
