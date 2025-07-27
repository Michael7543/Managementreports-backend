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
    private long id;

    @Column(name = "function_detail")
    private String functionDetail;
    @Column(name = "activity")
    private String activity;
    @Column(name = "sub_activity")
    private String subActivity;
    @Column(name = "stategy")
    private String stategy;
    @Column(name = "type_place")
    private String typePlace;
    @Column(name = "administration_zona")
    private String administrationZona;
    @Column(name = "public_space")
    private String publicSpace;
    @Column(name = "latitude")
    private Double latitude;
    @Column(name = "longitude")
    private Double longitude;
    @Column(name = "direction")
    private String direction;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id" , referencedColumnName = "id")
    private Users user;


}
