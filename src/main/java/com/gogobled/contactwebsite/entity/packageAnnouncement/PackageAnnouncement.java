package com.gogobled.contactwebsite.entity.packageAnnouncement;

import com.gogobled.contactwebsite.entity.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
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
    private Integer idPackageAnnouncement;
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
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}