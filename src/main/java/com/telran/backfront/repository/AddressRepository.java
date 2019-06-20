package com.telran.backfront.repository;

import com.telran.backfront.model.entity.Address;
import com.telran.backfront.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface AddressRepository extends JpaRepository <Address, Long> {

    List <Address> findAllByUser(User user);

    void deleteAllByUser(User user);

    Optional <Address> findByCountryAndCityAndStreetAndHouseNumberAndApartment(String country,
                                                                               String city,
                                                                               String street,
                                                                               String houseNumber,
                                                                               String apartment);

}
