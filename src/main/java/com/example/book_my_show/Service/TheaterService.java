package com.example.book_my_show.Service;

import com.example.book_my_show.Convertors.TheaterConvertors;
import com.example.book_my_show.Entities.TheaterEntity;
import com.example.book_my_show.Entities.TheaterSeatEntity;
import com.example.book_my_show.EntryDto.TheaterEntryDto;
import com.example.book_my_show.Enums.SeatType;
import com.example.book_my_show.Repository.TheaterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TheaterService {
    @Autowired
    TheaterRepository theaterRepository;

    public String addTheater(TheaterEntryDto theaterEntryDto) throws Exception{

        TheaterEntity theaterEntity= TheaterConvertors.convertDtoToEntity(theaterEntryDto);

        List<TheaterSeatEntity> theaterSeatEntityList=addTheaterSets(theaterEntryDto,theaterEntity);

        theaterEntity.setTheaterSeatEntityList(theaterSeatEntityList);

        theaterRepository.save(theaterEntity);
        return "Theater Added successfully";
    }

    private List<TheaterSeatEntity> addTheaterSets(TheaterEntryDto theaterEntryDto,TheaterEntity theaterEntity) throws Exception{

        int countOfClassicSeats=theaterEntryDto.getClassicSeatsCount();
        int countOfPremiumSeats=theaterEntryDto.getPremiumSeatsCount();

        List<TheaterSeatEntity> theaterSeatEntityList= new ArrayList<>();

        for(int count=1;count <= countOfClassicSeats;count++){
            TheaterSeatEntity theaterSeatEntity=TheaterSeatEntity.builder()
                    .seatType(SeatType.CLASSIC)
                    .seatNo(count+"C")
                    .theaterEntity(theaterEntity)
                    .build();
            theaterSeatEntityList.add(theaterSeatEntity);
        }
        for(int count=1;count <= countOfPremiumSeats;count++){
            TheaterSeatEntity theaterSeatEntity=TheaterSeatEntity.builder()
                    .seatType(SeatType.PREMIUM)
                    .seatNo(count+"P")
                    .theaterEntity(theaterEntity)
                    .build();
            theaterSeatEntityList.add(theaterSeatEntity);
        }
        return theaterSeatEntityList;
    }
}
