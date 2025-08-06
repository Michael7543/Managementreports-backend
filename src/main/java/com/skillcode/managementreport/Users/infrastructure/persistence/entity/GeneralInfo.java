package com.skillcode.managementreport.Users.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "general_info", indexes = {
        @Index(name = "idx_general_user", columnList = "user_id")
})
public class GeneralInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "service_order", length = 100)
    private String serviceOrder;
    @Column(name = "service_code", length = 50)
    private String serviceCode;
    @Column(name = "date", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime date;
    @Column(name = "start_time")
    private LocalTime startTime;
    @Column(name = "end_time")
    private LocalTime endTime;
    @Column(name = "receiver", length = 100)
    private String receiver;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_general_user"))
    private Users user;

    @OneToMany(mappedBy = "generalInfo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DetailInfo> detailInfos = new ArrayList<>();

    @OneToMany(mappedBy = "generalInfo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SupportStaff> supportStaff = new ArrayList<>();

    @OneToMany(mappedBy = "generalInfo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ResourcesUsed> resourcesUsed = new ArrayList<>();

    @OneToMany(mappedBy = "generalInfo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ResultObtained> resultObtained = new ArrayList<>();

    @OneToMany(mappedBy = "generalInfo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Observations> observations = new ArrayList<>();

    @OneToMany(mappedBy = "generalInfo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Images> images = new ArrayList<>();
}
