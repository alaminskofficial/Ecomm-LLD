package com.example.ecomm.controllers;


import com.example.ecomm.dtos.GetAdvertisementForUserRequestDto;
import com.example.ecomm.dtos.GetAdvertisementForUserResponseDto;
import com.example.ecomm.dtos.ResponseStatus;
import com.example.ecomm.exceptions.UserNotFoundException;
import com.example.ecomm.models.Advertisement;
import com.example.ecomm.services.AdsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class AdsController {

    private AdsService adsService;

    @Autowired
    public AdsController(AdsService adsService) {
        this.adsService = adsService;
    }

    public GetAdvertisementForUserResponseDto getAdvertisementForUser(GetAdvertisementForUserRequestDto requestDto){
        GetAdvertisementForUserResponseDto responseDto = new GetAdvertisementForUserResponseDto();
        try{
            Advertisement advertisement = adsService.getAdvertisementForUser(requestDto.getUserId());
            responseDto.setAdvertisement(advertisement);
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
            return responseDto;
        } catch (UserNotFoundException e) {
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
            return responseDto;
        }
    }
}
