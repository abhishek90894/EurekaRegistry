package com.user.services;

import com.user.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userServiceImpl implements userService{

    // fake user list

    List<User> list = List.of(
            new User(234567L,"abhishek srivastava","81234567"),
            new User(234561L,"ankur srivastava","70654321"),
            new User(123456L,"anshu srivastava","654321789")


    );

    @Override
    public User getUser(Long id) {

        return list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
    }
}
