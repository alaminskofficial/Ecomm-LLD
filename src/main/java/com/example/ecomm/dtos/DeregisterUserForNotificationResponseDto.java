package com.example.ecomm.dtos;

import lombok.Data;

@Data
public class DeregisterUserForNotificationResponseDto {
    private ResponseStatus responseStatus;

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }
}
