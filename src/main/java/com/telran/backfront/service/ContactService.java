package com.telran.backfront.service;


import com.telran.backfront.model.dto.ContactDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ContactService {

    ContactDto getContact(Long id);
    List<ContactDto> getAllContacts();

    List<ContactDto> getAllContactsByName(String name);
    List<ContactDto> getAllContactsByPhone(String phone);

    //-----------------

    void createContact(ContactDto contactDto);
    void updateContact(Long id, ContactDto contactDto);
    void deleteContact(Long id);

}
