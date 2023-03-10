package com.example.book_my_show.Entities;


import com.example.book_my_show.Enums.Genre;
import com.example.book_my_show.Enums.Language;
//import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "movies")
@Data
@Builder
@AllArgsConstructor
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

    //parent wrt show
    @OneToMany(mappedBy = "movieEntity",cascade = CascadeType.ALL)
    private List<ShowEntity> showEntityList= new ArrayList<>();


}
