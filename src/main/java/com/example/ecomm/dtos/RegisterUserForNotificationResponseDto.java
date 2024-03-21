package com.example.ecomm.dtos;


import com.example.ecomm.models.Notification;
import lombok.Data;

@Data
public class RegisterUserForNotificationResponseDto {
    private Notification notification;
    private ResponseStatus responseStatus;

    public Notification getNotification() {
        return notification;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }
}
