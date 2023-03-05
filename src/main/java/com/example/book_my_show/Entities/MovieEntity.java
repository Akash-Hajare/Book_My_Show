package com.example.book_my_show.Entities;


import com.example.book_my_show.Enums.Genre;
import com.example.book_my_show.Enums.Language;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "movies")
@Data
@NoArgsConstructor
public class MovieEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true,nullable = false)
    private String movieName;

    private double ratings;

    private double duration;

    @Enumerated(value = EnumType.STRING)
    private Language language;


    @Enumerated(value = EnumType.STRING)
    private Genre genre;

}
