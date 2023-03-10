package com.example.book_my_show.Controller;

import com.example.book_my_show.EntryDto.MovieEntryDto;
import com.example.book_my_show.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movie")
public class MovieController {

    @Autowired
    MovieService movieService;


    @PostMapping("/add-movie")
    public ResponseEntity<String> addMovie(@RequestBody MovieEntryDto movieEntryDto){
        try{
            String response=movieService.addMovie(movieEntryDto);
            return new ResponseEntity<>(response, HttpStatus.CREATED);
        }catch (Exception exception){
            String result="Movie not added due to exception";
            return new ResponseEntity<>(result,HttpStatus.BAD_REQUEST);
        }
    }
}
