package com.skillcode.managementreport.Users.domain.model;

import java.util.UUID;

public record SupervisorActivityDetail(
        UUID id,
        UsersDetail users,
        GeneralInfoDetail generalInfo,
        StateDetail state
) {}