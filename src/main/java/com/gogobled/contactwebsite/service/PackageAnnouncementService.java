package com.gogobled.contactwebsite.service;

import com.gogobled.contactwebsite.entity.packageAnnouncement.PackageAnnouncementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PackageAnnouncementService {
    private final PackageAnnouncementRepository packageAnnouncementRepository;
}
