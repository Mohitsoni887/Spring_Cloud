package com.capgemini.hotel.services;

import com.capgemini.hotel.entites.Hotel;

import java.util.List;

public interface HotelService {

    //create
    Hotel create (Hotel  hotel);

    //get all
    List<Hotel>getAll();

    //get single
    Hotel get(String Id);
}
