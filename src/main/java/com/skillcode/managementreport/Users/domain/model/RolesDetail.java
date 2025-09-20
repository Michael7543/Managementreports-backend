package com.skillcode.managementreport.Users.domain.model;

import java.util.List;

public record RolesDetail(
        Long id,
        String roleName,
        String description,
        List<UsersRolesDetail> userWhitRole,
        List<ReceptorDetail> receptors
) {}