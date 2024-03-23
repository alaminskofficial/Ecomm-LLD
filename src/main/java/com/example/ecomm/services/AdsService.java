package com.example.ecomm.services;


import com.example.ecomm.exceptions.UserNotFoundException;
import com.example.ecomm.models.Advertisement;

public interface AdsService {

    public Advertisement getAdvertisementForUser(int userId) throws UserNotFoundException;
}
