package com.skillcode.managementreport.Users.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "state",schema = "management_report")
public class StateEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "name",length = 255)
    private String name;

    @OneToMany(mappedBy = "stateEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<GeneralInfoEntity> generalInfoEntity = new ArrayList<>();

    @OneToMany(mappedBy = "stateEntity", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SupervisorActivity> supervisorActivity = new ArrayList<>();

}
