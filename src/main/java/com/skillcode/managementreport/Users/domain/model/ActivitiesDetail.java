package com.skillcode.managementreport.Users.domain.model;

import java.util.List;
import java.util.UUID;

public record ActivitiesDetail(
        UUID id,
        String activityName,

        FunctionDetail functionDetail,
        List<DetailInfo> detailInfo,
        List<SubActivitiesDetail> subActivitiesDetail
) {
}
