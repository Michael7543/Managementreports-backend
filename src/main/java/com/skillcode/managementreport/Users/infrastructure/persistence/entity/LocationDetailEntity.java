package com.skillcode.managementreport.Users.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "locations", schema = "management_report")
public class LocationDetailEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private BigDecimal  latitude;
    private BigDecimal longitude;
    private String direction;

    @OneToMany(mappedBy = "locationDetail", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<DetailInfoEntity> detailInfo = new ArrayList<>();
}
