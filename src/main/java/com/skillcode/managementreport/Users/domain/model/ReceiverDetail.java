package com.skillcode.managementreport.Users.domain.model;

import java.util.UUID;

public record ReceiverDetail(
        UUID id,
        GeneralInfoDetail generalInfo,
        UsersDetail users
) {}
