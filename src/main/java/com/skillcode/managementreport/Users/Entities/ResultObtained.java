package com.skillcode.managementreport.Users.Entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "result_obtained")
public class ResultObtained {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(name = "name")
    private String name;
    @Column(name = "stock")
    private Integer stock;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private Users user;

    /**
     * Desacomentar la relación cuando ya exista la entidad corresponsiente
     */

   //@ManyToOne(fetch = FetchType.LAZY)
   //@JoinColumn(name = "general_info_id")
   //private GeneralInfo generalInfo;
}
