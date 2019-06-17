package com.telran.backfront.service;

import com.telran.backfront.model.dto.ContactDto;
import com.telran.backfront.model.entity.User;
import com.telran.backfront.repository.AddressRepository;
import com.telran.backfront.repository.PhoneNumberRepository;
import com.telran.backfront.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import java.util.stream.Collectors;

public class ContactServiceImplements implements ContactService {

    @Autowired
    private PhoneNumberRepository phoneNumberRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AddressRepository addressRepository;


    @Override
    public ContactDto getContact(Long id) {

    return null;
    }

    @Override
    @Transactional(readOnly = true)
    public List<ContactDto> getAllContacts() {
        List<Long> contactsIDS = userRepository.getAllUserId();
        return contactsIDS.stream().map(id -> getContact(id)).collect(Collectors.toList());
    }

    @Override
    public List<ContactDto> getAllContactsByName(String name) {
        return null;
    }

    @Override
    public List<ContactDto> getAllContactsByPhone(String phone) {
        return null;
    }

    @Override
    public void createContact(ContactDto contactDto) {

    }

    @Override
    public void updateContact(Long id, ContactDto contactDto) {

    }

    @Override
    public void deleteContact(Long id) {

    }
}