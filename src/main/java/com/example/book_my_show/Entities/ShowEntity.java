package com.example.book_my_show.Entities;


import com.example.book_my_show.Enums.ShowType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "shows")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ShowEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

   private LocalDate showDate;

   private LocalTime showTime;

   @Enumerated(value = EnumType.STRING)
   private ShowType showType;

   @CreationTimestamp
    private Date createdOn;

   @UpdateTimestamp
    private Date updatedOn;

   //This is child wrt movie
    @ManyToOne
    @JoinColumn
    private MovieEntity movieEntity;

    //This is child wrt theater
    @ManyToOne
    @JoinColumn
    private TheaterEntity theaterEntity;

    //show is parent wrt tickets
    @OneToMany(mappedBy = "showEntity",cascade = CascadeType.ALL)
    private List<TicketEntity> listOfBookedTickets= new ArrayList<>();

    //show is parent wrt show_seats
    @OneToMany(mappedBy = "showEntity",cascade = CascadeType.ALL)
    private List<ShowSeatEntity> listOfShowSeats= new ArrayList<>();


}
