package com.contact.controller;

import com.contact.entity.Contact;
import com.contact.services.contactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contact")
public class contactController {

    @Autowired
     private contactService contactService;
    @GetMapping("/user/{userId}")
    public List<Contact>  getContacts(@PathVariable("userId") Long userId)
    {
      return   contactService.getContactOfUser(userId);
    }
}
