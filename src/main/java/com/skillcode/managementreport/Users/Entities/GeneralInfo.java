package com.skillcode.managementreport.Users.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Time;
import java.sql.Timestamp;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "general_info")
public class GeneralInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "order_service")
    private String orderService;
    @Column(name = "fecha")
    private Timestamp fecha;
    @Column(name = "time_start")
    private Time timeStart;
    @Column(name = "time_end")
    private Time timeEnd;
    @Column(name = "code")
    private String code;
    @Column(name = "receiver")
    private String receiver;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id" , referencedColumnName = "id")
    private Users user;


}
