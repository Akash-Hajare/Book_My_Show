package com.example.book_my_show.Convertors;

import com.example.book_my_show.Entities.TheaterEntity;
import com.example.book_my_show.EntryDto.TheaterEntryDto;

public class TheaterConvertors {

    public static TheaterEntity convertDtoToEntity(TheaterEntryDto theaterEntryDto){
        TheaterEntity theaterEntity= TheaterEntity.builder()
                .name(theaterEntryDto.getName())
                .location(theaterEntryDto.getLocation())
                .build();
        return theaterEntity;
    }
}
