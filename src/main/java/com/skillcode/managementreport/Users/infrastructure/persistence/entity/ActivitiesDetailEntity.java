package com.skillcode.managementreport.Users.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "activities", schema = "management_report")
public class ActivitiesDetailEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "activity_name", nullable = false, unique = true)
    private String activityName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "function_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_function"))
    private FunctionDetailEntity  functionDetail;

    @OneToMany(mappedBy = "activitiesDetail", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DetailInfoEntity> detailInfo = new ArrayList<>();

    @OneToMany(mappedBy = "activityDetail", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SubActivitiesDetailEntity>  subActivitiesDetail = new ArrayList<>();

}
