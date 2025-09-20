package com.skillcode.managementreport.Users.domain.model;

import java.util.Date;

import java.util.Date;

public record SupportStaffDetail(
        Long id,
        String staffName,
        Date assignmentDate,
        UsersDetail users,
        RolesDetail roles,
        GeneralInfoDetail generalInfo
) {
}
