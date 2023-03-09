package com.example.book_my_show.EntryDto;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TheaterEntryDto {

    //Attributes that we require
    private String name;

    private String location;

    private int classicSeatsCount;

    private int premiumSeatsCount;
}
