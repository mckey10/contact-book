package com.telran.backfront.controller;



import com.telran.backfront.model.dto.ContactDto;
import com.telran.backfront.model.entity.User;


import com.telran.backfront.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api")
public class Controller {
    @Autowired
    ContactService contactService;

    @GetMapping(value = "/getAllContacts")
    private List<ContactDto> getAllContacts() {
        return contactService.getAllContacts();
    }




}
