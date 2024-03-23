package com.example.ecomm.dtos;


import com.example.ecomm.models.Advertisement;
import lombok.Data;

@Data
public class GetAdvertisementForUserResponseDto {
    private Advertisement advertisement;
    private ResponseStatus responseStatus;

    public Advertisement getAdvertisement() {
        return advertisement;
    }

    public void setAdvertisement(Advertisement advertisement) {
        this.advertisement = advertisement;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }
}
