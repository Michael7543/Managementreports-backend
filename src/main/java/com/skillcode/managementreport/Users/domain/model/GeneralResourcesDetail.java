package com.skillcode.managementreport.Users.domain.model;

import java.util.UUID;

public record GeneralResourcesDetail(
        UUID id,
        Integer quantity,
        ResourceCatalogDetail resourceCatalog,
        GeneralInfoDetail generalInfo
) {}