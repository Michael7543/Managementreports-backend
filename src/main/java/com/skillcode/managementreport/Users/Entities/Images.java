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
@Table(name = "images")
public class Images {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "file_name")
    private String fileName;

    @Column(name = "public_url")
    private String publicUrl;

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
