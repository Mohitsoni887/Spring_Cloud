package com.capgemini.userservice.services;
import com.capgemini.userservice.entities.User;

import java.util.List;

public interface UserServices {

    //user operations

    //create
    User saveUser(User user);

    //get all user
    List<User> getAllUser();

    //get single user of given userID
    User getUser(String userId);




}
