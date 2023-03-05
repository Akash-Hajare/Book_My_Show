package com.example.book_my_show.Entities;


import com.example.book_my_show.Enums.SeatType;
import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "show_seats")
public class ShowSeatEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private boolean isBooked;

    private int price;

    private String seatNo;

    @Enumerated(value = EnumType.STRING)
    private SeatType seatType;

    private Date bookedAt;

    @ManyToOne
    @JoinColumn
    private ShowEntity showEntity;


}
