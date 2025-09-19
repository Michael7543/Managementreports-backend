package com.skillcode.managementreport.Users.domain.model;


import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public record GeneralInfoDetail(
        Long id,
        String serviceCode,
        LocalDateTime date,
        LocalTime startTime,
        LocalTime endTime,
        UsersDetail user,
        ResultsObtainedDetail resultObtainedDetail,
        OrderServiceDetail orderServiceDetail,
        StateDetail stateDetail,
        StructureInfoDetail structureInfoDetail,
        List<SupportStaffDetail> supportStaff,
        List<GeneralResourcesDetail> generalResourcesDetails,
        List<ImagesDetail> images,
        List<ReceiverDetail> receivers,
        List<SupervisorActivityDetail> supervisorActivity,
        List<EvaluationsDetail> evaluations
) {
}
