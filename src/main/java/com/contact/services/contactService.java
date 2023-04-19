package com.contact.services;

import com.contact.entity.Contact;

import java.util.List;

public interface contactService {

    public List<Contact> getContactOfUser(Long userId);

}
