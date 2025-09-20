package com.skillcode.managementreport.Users.domain.model;

import java.util.UUID;

public record DetailInfo(
        UUID id,
        String observations,
        ActivitiesDetail activitiesDetail,
        SubActivitiesDetail subActivitiesDetail,
        LocationDetail locationDetail,
        /*GeneralInfo generalInfo,*/
        TypeSpaceDetail typeSpaceDetail,
        AdministrationZoneDetail administrationZoneDetail,
        PublicSpaceDetail publicSpaceDetail,
        FunctionDetail functionDetail
) {
}
