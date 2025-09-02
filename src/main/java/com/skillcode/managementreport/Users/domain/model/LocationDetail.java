package com.skillcode.managementreport.Users.domain.model;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public record LocationDetail(
        UUID id,
        BigDecimal latitude,
        BigDecimal longitude,
        String direction,
        List<DetailInfo> detailInfo
) {
}
