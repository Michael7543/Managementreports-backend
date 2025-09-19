package com.skillcode.managementreport.Users.domain.model;

import java.util.List;
import java.util.UUID;

public record StateDetail(
        UUID id,
        String name,
        List<GeneralInfoDetail> generalInfo,
        List<SupervisorActivityDetail> supervisorActivity
) {}