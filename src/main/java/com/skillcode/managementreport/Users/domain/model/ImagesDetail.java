package com.skillcode.managementreport.Users.domain.model;

public record ImagesDetail(
        Long id,
        String fileName,
        String publicUrl,
        UsersDetail user,
        GeneralInfoDetail generalInfo
) {
}
