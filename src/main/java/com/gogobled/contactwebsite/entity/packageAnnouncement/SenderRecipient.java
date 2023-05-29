package com.gogobled.contactwebsite.entity.packageAnnouncement;

import com.gogobled.contactwebsite.entity.user.Permission;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Set;

import static com.gogobled.contactwebsite.entity.user.Permission.PROFESSIONALS;
import static com.gogobled.contactwebsite.entity.user.Permission.USER;

@RequiredArgsConstructor
public enum SenderRecipient {
    SENDER,
    RECIPIENT;
}