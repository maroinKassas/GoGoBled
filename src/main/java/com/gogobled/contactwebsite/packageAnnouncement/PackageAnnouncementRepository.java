package com.gogobled.contactwebsite.packageAnnouncement;

import com.gogobled.contactwebsite.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PackageAnnouncementRepository extends JpaRepository<PackageAnnouncement, Integer> {

    PackageAnnouncement findById(final int id);
    List<PackageAnnouncement> findAllByUserId(final int userId);
    //void updatePackageAnnouncementById(final int id, final PackageAnnouncement packageAnnouncement);
    void deleteById(final int id);
}
