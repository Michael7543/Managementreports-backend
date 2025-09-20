package com.skillcode.managementreport.Users.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.UUID;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "general_resources",schema = "management_report")
public class GeneralResources implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "quantity")
    private Integer quantity;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "resource_catalog_id", foreignKey = @ForeignKey(name = "fk_resource_user"))
    private ResourceCatalog resourceCatalog;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "general_info_id", referencedColumnName = "id",foreignKey = @ForeignKey(name = "fk_general_info"))
    private GeneralInfo generalInfo;

}
