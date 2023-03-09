package com.example.book_my_show.EntryDto;

import com.example.book_my_show.Enums.Genre;
import com.example.book_my_show.Enums.Language;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MovieEntryDto {
    private String movieName;

    private double ratings;

    private int duration;

    private Language language;

    private Genre genre;
}
