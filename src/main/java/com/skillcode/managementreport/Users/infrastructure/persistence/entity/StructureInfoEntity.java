package com.skillcode.managementreport.Users.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


import java.io.Serial;
import java.io.Serializable;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "structure_info",schema = "management_report")

public class StructureInfoEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "name",length = 255)
    private String name;

    @OneToMany(mappedBy = "structureInfoEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<GeneralInfoEntity> generalInfoEntity = new ArrayList<>();

}
