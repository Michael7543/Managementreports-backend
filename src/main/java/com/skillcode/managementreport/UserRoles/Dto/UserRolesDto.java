package com.skillcode.managementreport.UserRoles.Dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRolesDto {
    private long id;
    private long user_id;
    private long rol_id;
}
