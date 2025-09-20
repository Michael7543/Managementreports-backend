package com.skillcode.managementreport.Users.domain.model;

import java.util.List;
import java.util.UUID;

public record OrderServiceDetail(
        UUID id,
        List<GeneralInfoDetail> generalInfo
) {}
