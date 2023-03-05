package com.example.book_my_show.Service;


import com.example.book_my_show.Entities.UserEntity;
import com.example.book_my_show.EntryDto.UserEntryDto;
import com.example.book_my_show.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public String addUser(UserEntryDto userEntryDto) {

        UserEntity userEntity = UserEntity.builder().age(userEntryDto.getAge())
                .email(userEntryDto.getEmail()).mobNo(userEntryDto.getMobNo())
                .name(userEntryDto.getName()).address(userEntryDto.getAddress()).build();

        userRepository.save(userEntity);
        return "User added successfully";

    }
}