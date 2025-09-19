package com.skillcode.managementreport.Users.domain.model;

import java.util.UUID;

public record GeneralResourcesDetail(
        UUID id,
        ResourceCatalogDetail resourceCatalog,
        GeneralInfoDetail generalInfo
) {}