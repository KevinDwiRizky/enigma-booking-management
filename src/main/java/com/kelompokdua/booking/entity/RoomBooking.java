package com.kelompokdua.booking.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.kelompokdua.booking.constant.EBookingRoom;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "t_room_booking")
public class RoomBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "room_id")
    private Rooms room;

    @OneToMany
    @JoinColumn(name = "equipmentId")
    private List<Equipments> equipmentsId;

    @Column(nullable = false)
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", timezone = "Asia/Jakarta")
    private Date bookingDate;

    @Column(nullable = false)
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", timezone = "Asia/Jakarta")
    private Date startTime;

    @Column(nullable = false)
    @JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss", timezone = "Asia/Jakarta")
    private Date endTime;

    private String description;

    @Enumerated(EnumType.STRING)
    private EBookingRoom status;

    @Column(nullable = false)
    private Long totalPrice;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "payment_id")
    private Payment payment;

}
