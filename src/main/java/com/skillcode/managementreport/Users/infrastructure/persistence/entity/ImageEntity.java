package com.skillcode.managementreport.Users.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "images",schema = "management_report")
public class Images {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "file_name", length = 255)
    private String fileName;

    @Column(name = "public_url", length = 255)
    private String publicUrl;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(name = "fk_img_user"))
    private Users user;

    /**
     * Desacomentar la relación cuando ya exista la entidad corresponsiente
     */

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "general_info_id", referencedColumnName = "id")
    private GeneralInfo generalInfo;
}
