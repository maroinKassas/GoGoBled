package com.gogobled.contactwebsite.entity.packageAnnouncement;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PackageAnnouncementRepository extends JpaRepository<PackageAnnouncement, Integer> {

    Optional<PackageAnnouncement> findUserByEmail(final String email);

    void deleteByEmail(final String email);
}
