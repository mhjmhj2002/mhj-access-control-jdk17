package com.mhj.ms.access.control.dto;

import java.util.List;

import com.mhj.ms.access.control.entities.Role;

public record RecoveryUserDto(

        Long id,
        String email,
        List<Role> roles

) {
}
