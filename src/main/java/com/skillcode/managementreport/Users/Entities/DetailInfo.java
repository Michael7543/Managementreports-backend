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

    @Column(name = "function_detail", length = 255)
    private String functionDetail;
    @Column(name = "activity")
    private String activity;
    @Column(name = "sub_activity")
    private String subActivity;
    @Column(length = 100)
    private String strategy;
    @Column(name = "type_place", length = 255)
    private String typePlace;
    @Column(name = "administration_zone", length = 255)
    private String administrationZone;
    @Column(name = "public_space", length = 255)
    private String publicSpace;
    @Column(name = "latitude", precision = 10, scale = 7)
    private Double latitude;
    @Column(name = "longitude", precision = 10, scale = 7)
    private Double longitude;
    @Column(name = "direction", length = 255)
    private String direction;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_detail_user"))
    private Users user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "general_info_id", referencedColumnName = "id")
    private GeneralInfo generalInfo;
}
