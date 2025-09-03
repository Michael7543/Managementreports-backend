package com.skillcode.managementreport.Users.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "detail_activity", schema = "management_report")
public class DetailInfoEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "observations", length = 255, nullable = false)
    private String observations;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "activities_detail_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_activities_detail"))
    private ActivitiesDetailEntity activitiesDetail;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "subactivities_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_subactivity_detail"))
    private SubActivitiesDetailEntity subActivitiesDetail;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "location_detail_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_location_detail"))
    private LocationDetailEntity locationDetail;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "general_info_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_general_info"))
    private GeneralInfo generalInfo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "type_space__detail_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_type_space_detail"))
    private TypeSpaceDetailEntity typeSpaceDetail;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "administration_zone_detail_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_administration_zone_detail"))
    private AdministrationZoneDetailEntity administrationZoneDetail;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "public_space_detail_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_public_space_detail"))
    private PublicSpaceDetailEntity publicSpaceDetail;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "function_detail_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_function_detail"))
    private FunctionDetailEntity functionDetail;

}
