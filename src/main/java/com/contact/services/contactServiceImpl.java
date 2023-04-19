package com.contact.services;

import com.contact.entity.Contact;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class contactServiceImpl implements contactService{
    // fake contact list
    List<Contact>  contacts = List.of(
                 new Contact(12L,"abhishek@gmail.com","abhishek",234567L),
                 new Contact(13L,"srivastava@gmail.com","srivastava",234567L),
                new Contact(14L,"ankit@gmail.com","ankit",234561L),
                 new Contact(15L,"ankur@gmail.com","diksha",123456L)
    );


    @Override
    public List<Contact> getContactOfUser(Long userId) {
        return contacts.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
    }
}
