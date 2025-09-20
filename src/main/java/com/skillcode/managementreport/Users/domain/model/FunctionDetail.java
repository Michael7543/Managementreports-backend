package com.skillcode.managementreport.Users.domain.model;

import java.util.List;
import java.util.UUID;

public record FunctionDetail(
        UUID id,
        String functionName,
        List<ActivitiesDetail> activitiesDetail,
        List<DetailInfo> detailInfo
) {
}
