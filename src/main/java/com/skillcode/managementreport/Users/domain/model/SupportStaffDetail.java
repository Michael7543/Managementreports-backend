package com.skillcode.managementreport.Users.domain.model;

import java.util.Date;

public record SupportStaffDetail(
        Long id,
        String staffName,
        Date fechaAsignacion,
        UsersDetail users,
        GeneralInfoDetail generalInfo
) {}
