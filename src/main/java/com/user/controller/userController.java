package com.user.controller;

import com.user.entity.Contact;
import com.user.entity.User;
import com.user.services.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class userController {
     @Autowired
     private userService userService;
     @Autowired
     private RestTemplate restTemplate;
     @GetMapping("/{userId}")
     public User getUser(@PathVariable("userId") Long userId)
     {
       User user  = userService.getUser(userId);
      List<Contact> contacts =    restTemplate.getForObject("http://contact-service/contact/user/"+ user.getUserId(), List.class);
          user.setContact(contacts);
       return user;
     }
}
