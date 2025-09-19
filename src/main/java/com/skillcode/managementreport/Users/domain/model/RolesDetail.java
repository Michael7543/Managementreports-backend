package com.skillcode.managementreport.Users.domain.model;

import java.util.List;

public record RolesDetail(
        long id,
        String roleName,
        String description,
        List<UsersRolesDetail> userWhitRole
) {}