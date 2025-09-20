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
        String password,
        boolean active,
        List<UsersRolesDetail> userRoles,
        List<GeneralInfoDetail> userEmisor,
        List<GeneralInfoDetail> userReceptor,
        List<SupportStaffDetail> supportStaffs,
        List<ReceptorDetail> receptors,
        List<SupervisorActivityDetail> supervisorActivities
) {
}


