package com.springweb.project.uberapp.dtos;

import com.springweb.project.uberapp.enities.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {

    private String name;
    private String email;
    private Set<Role> roles;

}
