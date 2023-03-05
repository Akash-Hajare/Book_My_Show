package com.example.book_my_show.Entities;


import com.example.book_my_show.Enums.ShowType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

@Entity
@Table(name = "show")
@Data
@NoArgsConstructor
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
}
