package com.skillcode.managementreport.Users.domain.model;

import java.util.List;
import java.util.UUID;

public record TypeSpaceDetail(
        UUID id,
        String name,
        List<DetailInfo> detailInfo
) {
}
