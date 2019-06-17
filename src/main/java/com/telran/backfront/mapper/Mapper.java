package com.telran.backfront.mapper;

import com.telran.backfront.model.dto.AddressDto;
import com.telran.backfront.model.dto.ContactDto;
import com.telran.backfront.model.entity.Address;
import com.telran.backfront.model.entity.PhoneNumber;
import com.telran.backfront.model.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class Mapper {
    public static ContactDto convertUserToContactDTO(
            User user, List<Address> address, List<PhoneNumber> phoneNumber) {
        return ContactDto.builder()
                .fullName(user.getFullName())
                .email(user.getEmail())
                .phoneNumbers(phoneNumber.stream().map(PhoneNumber::getPhoneNumber).collect(Collectors.toList()))
                .addresses(address.stream().map(addresses -> convertAddressToAddressDTO(addresses)).collect(Collectors.toList()))
                .build();
    }

    public static AddressDto convertAddressToAddressDTO(Address address) {
        return AddressDto.builder()
                .country(address.getCountry())
                .city(address.getCity())
                .street(address.getStreet())
                .houseNumber(address.getHouseNumber())
                .apartment(address.getApartment())
                .build();
    }
}
