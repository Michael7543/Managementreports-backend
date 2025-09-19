package com.skillcode.managementreport.Users.domain.model;

import java.util.List;
import java.util.UUID;

public record UsersDetail(
        Long id,
        String firstName,
        String lastName,
        String identityCard,
        int phone,
        String email,
        boolean active,
        List<UsersRolesDetail> userRoles,
        List<GeneralInfoDetail> generalInfos
) {
}

