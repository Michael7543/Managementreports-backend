package com.skillcode.managementreport.Users.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import java.io.Serializable;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "activities_specific",schema = "management_report")
public class ActivitiesSpecific implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "name_activity",length = 50)
    private  String nameActivity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_function_general", referencedColumnName = "id", foreignKey = @ForeignKey(name="fk_function_general"))
    private FunctionDetailEntity functionDetailEntity;

    @OneToMany(mappedBy = "activitiesSpecific", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SubActivitiesDetailEntity> subActivitiesDetailEntities = new ArrayList<>();
}
