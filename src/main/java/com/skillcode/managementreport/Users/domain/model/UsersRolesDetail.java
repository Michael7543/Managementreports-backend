package com.skillcode.managementreport.Users.domain.model;

public record UsersRolesDetail(
        Long id,
        UsersDetail usersDetail,
        RolesDetail rolesDetail,
        boolean active
) {
}
