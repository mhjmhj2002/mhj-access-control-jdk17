package com.mhj.ms.access.control.dto;

import com.mhj.ms.access.control.enums.RoleName;

public record CreateUserDto(

        String email,
        String password,
        RoleName role

) {
}
