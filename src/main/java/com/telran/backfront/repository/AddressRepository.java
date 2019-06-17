package com.telran.backfront.repository;

import com.telran.backfront.model.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;



public interface AddressRepository extends JpaRepository<Address, Long> {

}
