package com.capgemini.rating.services.Impl;

import com.capgemini.rating.entities.Rating;
import com.capgemini.rating.repositories.RatingRepository;
import com.capgemini.rating.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    private RatingRepository ratingRepository;

    @Override
    public Rating create(Rating rating) {
        // Generate unique ratingId if it's null or empty
        if (rating.getRatingId() == null || rating.getRatingId().isEmpty()) {
            rating.setRatingId(UUID.randomUUID().toString());
        }
        return ratingRepository.save(rating);
    }

    @Override
    public List<Rating> getRatings() {
        return ratingRepository.findAll();
    }

    @Override
    public List<Rating> getRatingByUSerId(String userId) {
        return ratingRepository.findByUserId(userId);
    }

    @Override
    public List<Rating> getRatingByHotelId(String hotelId) {
        return ratingRepository.findByHotelId(hotelId);
    }
}
