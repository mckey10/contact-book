package com.telran.backfront.repository;

import com.telran.backfront.model.entity.PhoneNumber;
import com.telran.backfront.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PhoneNumberRepository extends JpaRepository<PhoneNumber, Long> {


}
