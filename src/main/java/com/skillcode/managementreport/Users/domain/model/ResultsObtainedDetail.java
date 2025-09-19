package com.skillcode.managementreport.Users.domain.model;


import java.util.List;

public record ResultsObtainedDetail(
        Long id,
        String name,
        Integer stock,
        List<GeneralInfoDetail> generalInfo
) {}