package com.capgemini.rating.services;

import com.capgemini.rating.entities.Rating;

import java.util.List;

public interface RatingService {

    //create
    Rating create(Rating rating);

    //get all rating
    List<Rating> getRatings();


    //get all by userId
    List<Rating> getRatingByUSerId(String userId);


    //get all by hotel
    List<Rating> getRatingByHotelId(String hotelId);
}
