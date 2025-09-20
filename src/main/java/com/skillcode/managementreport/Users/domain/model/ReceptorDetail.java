package com.skillcode.managementreport.Users.domain.model;

import java.util.UUID;

public record ReceptorDetail(
        UUID id,
        GeneralInfoDetail generalInfo,
        UsersDetail users,
        RolesDetail roles
) {}
