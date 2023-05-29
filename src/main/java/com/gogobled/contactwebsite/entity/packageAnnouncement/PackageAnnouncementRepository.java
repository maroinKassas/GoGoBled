package com.gogobled.contactwebsite.entity.packageAnnouncement;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PackageAnnouncementRepository extends JpaRepository<PackageAnnouncement, Integer> {

    PackageAnnouncement findPackageAnnouncementById(final int id);

    void deletePackageAnnouncementBy(final int id);
}
