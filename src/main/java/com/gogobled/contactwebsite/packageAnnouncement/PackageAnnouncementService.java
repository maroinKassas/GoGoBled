package com.gogobled.contactwebsite.packageAnnouncement;

import com.gogobled.contactwebsite.Utils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PackageAnnouncementService {

    private final PackageAnnouncementRepository repository;

    public PackageAnnouncement getById(final int id) {
        return repository.findById(id);
    }

    public List<PackageAnnouncement> all() {
        return repository.findAllByUserId(Utils.getCurrentUserId());
    }

    public void add(final PackageAnnouncementRequest request) {
        PackageAnnouncement packageAnnouncement = PackageAnnouncement.builder()
                .title(request.getTitle())
                .quantity(request.getQuantity())
                .senderRecipient(request.getSenderRecipient())
                .startingAddress(request.getStartingAddress())
                .arrivalAddress(request.getArrivalAddress())
                .recipientNumber(request.getRecipientNumber())
                .additionalInformation(request.getAdditionalInformation())
                .price(request.getPrice())
                .deliveryStartDate(request.getDeliveryStartDate())
                .deliveryEndDate(request.getDeliveryEndDate())
                .userId(Utils.getCurrentUserId())
                .build();
        repository.save(packageAnnouncement);
    }

    public void update(final int id, final PackageAnnouncementRequest request) {
        PackageAnnouncement packageAnnouncement = repository.findById(id);
        packageAnnouncement.setTitle(request.getTitle());
        packageAnnouncement.setQuantity(request.getQuantity());
        packageAnnouncement.setSenderRecipient(request.getSenderRecipient());
        packageAnnouncement.setStartingAddress(request.getStartingAddress());
        packageAnnouncement.setArrivalAddress(request.getArrivalAddress());
        packageAnnouncement.setRecipientNumber(request.getRecipientNumber());
        packageAnnouncement.setAdditionalInformation(request.getAdditionalInformation());
        packageAnnouncement.setPrice(request.getPrice());
        packageAnnouncement.setDeliveryStartDate(request.getDeliveryStartDate());
        packageAnnouncement.setDeliveryEndDate(request.getDeliveryEndDate());
        repository.save(packageAnnouncement);
    }

    public void delete(final int id) {
        repository.deleteById(id);
    }
}
