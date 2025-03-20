package com.capgemini.hotel.services.Impl;

import com.capgemini.hotel.entites.Hotel;
import com.capgemini.hotel.exceptions.ResourceNotFoundException.ResourceNotFoundException;
import com.capgemini.hotel.repositories.HotelRepository;
import com.capgemini.hotel.services.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    @Override
    public Hotel create(Hotel hotel) {
        String hotelId = UUID.randomUUID().toString();
        hotel.setId(hotelId);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        return hotelRepository.findAll();
    }

    @Override
    public Hotel get(String Id) {
        return hotelRepository.findById(Id). orElseThrow(()-> new ResourceNotFoundException("Hotel with given id was not found !! : " + Id));
    }
}
