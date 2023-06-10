package com.gogobled.contactwebsite.packageAnnouncement;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PackageAnnouncementRequest {

    private String title;
    private String quantity;
    private SenderRecipient senderRecipient;
    private String startingAddress;
    private String arrivalAddress;
    private String recipientNumber;
    private String additionalInformation;
    private int price;
    private Date deliveryStartDate;
    private Date deliveryEndDate;
}
