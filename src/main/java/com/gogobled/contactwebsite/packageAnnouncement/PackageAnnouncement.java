package com.gogobled.contactwebsite.packageAnnouncement;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_package_announcement")
public class PackageAnnouncement {

    @Id
    @GeneratedValue
    private Integer id;
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
    private Date termination;
    private Date cancelation;
    @JoinColumn(name = "user_id")
    private int userId;
}