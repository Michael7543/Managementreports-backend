package com.skillcode.managementreport.Users.domain.model;

import java.util.List;
import java.util.UUID;

public record ActivitiesSpecificDetail(
        UUID id,
        String nameActivity,
        FunctionDetail functionDetail,
        List<SubActivitiesDetail> subActivitiesDetail
) {
}
