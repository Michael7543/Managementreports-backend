package com.skillcode.managementreport.Users.domain.model;

import java.math.BigDecimal;
import java.util.UUID;

public record EvaluationsDetail(
        UUID id,
        BigDecimal punctuation,
        String comment,
        GeneralInfoDetail generalInfoDetail
) {
}
