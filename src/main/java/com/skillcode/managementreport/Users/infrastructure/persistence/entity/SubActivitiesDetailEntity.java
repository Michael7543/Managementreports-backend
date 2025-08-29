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
@Table(name = "sub_activities", schema = "management_report")
public class SubActivitiesDetailEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "subactivity_name")
    private String subactivityName;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "activity_detail_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_activity_detail"))
    private ActivitiesDetailEntity  activityDetail;

}
