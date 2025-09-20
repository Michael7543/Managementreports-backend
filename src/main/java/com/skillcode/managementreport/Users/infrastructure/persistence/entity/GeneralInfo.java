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
@Table(name = "general_info",schema = "management_report", indexes = {
        @Index(name = "idx_general_user", columnList = "user_id")
})
public class GeneralInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "service_code", length = 50)
    private String serviceCode;
    @Column(name = "date", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private LocalDateTime date;
    @Column(name = "start_time")
    private LocalTime startTime;
    @Column(name = "end_time")
    private LocalTime endTime;


    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_user_emisor", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_id_user_emisor"))
    private Users emisor_user;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_user_receptor", referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_id_user_receptor"))
    private Users receptor_user;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "results_obtained_id", referencedColumnName = "id",foreignKey = @ForeignKey(name = "fk_results_obtained"))
    private ResultObtained resultObtained;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_service_id", referencedColumnName = "id",foreignKey  = @ForeignKey(name = "fk_order_service"))
    private OrderService orderService;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "state_id", referencedColumnName = "id",foreignKey = @ForeignKey(name = "fk_state"))
    private State state;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "structure_info_id", referencedColumnName = "id",foreignKey = @ForeignKey(name = "fk_structure_info"))
    private StructureInfo structureInfo;

 /*   @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "stategy_id", referencedColumnName = "id".foreingKey = @ForeignKey(name="fk_stategy"))
    private Strategy stategy;
*/

    @OneToMany(mappedBy = "generalInfo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<DetailInfo> detailInfos = new ArrayList<>();

    @OneToMany(mappedBy = "generalInfo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SupportStaff> supportStaff = new ArrayList<>();

    @OneToMany(mappedBy = "generalInfo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<GeneralResources> generalResources = new ArrayList<>();

    @OneToMany(mappedBy = "generalInfo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Images> images = new ArrayList<>();

    @OneToMany(mappedBy = "generalInfo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Receptor> receptor = new ArrayList<>();

    @OneToMany(mappedBy = "generalInfo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<SupervisorActivity> supervisorActivity = new ArrayList<>();

    @OneToMany(mappedBy = "generalInfo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Evaluations> evaluations = new ArrayList<>();


}
