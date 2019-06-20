package com.telran.backfront.controller;

import com.telran.backfront.model.dto.ContactDto;
import com.telran.backfront.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contact")
public class ContactController {

    @Autowired
    private ContactService contactService;


    @PostMapping()
    public void createContact(@RequestBody ContactDto contactDto) {
        contactService.createContact(contactDto);
    }

    @PutMapping("/{id}")
    public void updateContact(@PathVariable("id") Long id, @RequestBody ContactDto contactDto) {
        contactService.updateContact(id, contactDto);
    }

    @DeleteMapping("/{id}")
    public void deleteContact(@PathVariable("id") Long id) {
        contactService.deleteContact(id);
    }

    @GetMapping("/{id}")
    public ContactDto getContact(@PathVariable("id") Long id) {
        return contactService.getContact(id);
    }

    @GetMapping("/all")
    public List <ContactDto> getAllContacts() {
        return contactService.getAllContacts();
    }

    @GetMapping("/by-name")
    public ContactDto getContactByName(@RequestParam(value = "name") String name) {
        return contactService.getContactByName(name);
    }

    @GetMapping("/by-phone")
    public List <ContactDto> getContactByPhoneNumber(@RequestParam(value = "phone") String phoneNumber) {
        return contactService.getContactByPhoneNumber(phoneNumber);
    }

}
