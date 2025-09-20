package com.skillcode.managementreport.Users.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "result_obtained",schema = "management_report")
public class ResultObtained {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(name = "name")
    private String name;
    @Column(name = "quantity")
    private Integer quantity;


    @OneToMany(mappedBy = "resultObtained", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<GeneralInfo> generalInfo = new ArrayList<>();
}
