package com.skillcode.managementreport.Users.domain.model;

import java.util.List;
import java.util.UUID;

public record ResourceCatalogDetail(
        UUID id,
        String typeResource,
        List<GeneralResourcesDetail> generalResourcesDetail
) {}