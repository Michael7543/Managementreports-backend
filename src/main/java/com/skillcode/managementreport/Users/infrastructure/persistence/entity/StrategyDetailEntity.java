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
@Table(name = "strategies", schema = "management_report")
public class StrategyDetailEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "strategy_name", nullable = false)
    private String strategyName;
    /**
     * TODO (Michael): Agregar la relación faltante @ManyToOne en General info y descomentar esta relación.
     */

    //@OneToMany(mappedBy = "strategyDetail", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    //private List<GeneralInfoEntity> generalInfo;
}
