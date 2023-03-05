package com.example.book_my_show.EntryDto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserEntryDto {
    private String name;

    private int age;

    private String email;

    private String mobNo;

    private String address;
}
