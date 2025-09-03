package com.skillcode.managementreport.Users.domain.model;

import java.util.List;
import java.util.UUID;

public record SubActivitiesDetail(
        UUID id,
        String subactivityName,
        ActivitiesDetail activityDetail,
        List<DetailInfo> detailInfoEntities
) {
}
