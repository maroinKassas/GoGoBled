package com.gogobled.contactwebsite.user;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Set;

import static com.gogobled.contactwebsite.user.Permission.PROFESSIONALS;
import static com.gogobled.contactwebsite.user.Permission.USER;

@RequiredArgsConstructor
public enum TypeUser {

    USERS(Set.of(
            PROFESSIONALS,
            USER
    ));

    @Getter
    private final Set<Permission> permissions;
}