package com.telran.backfront.model.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ContactDto {

    private String fullName;

    private String email;

    private List <String> phoneNumbers;

    private List <AddressDto> addresses;


}
