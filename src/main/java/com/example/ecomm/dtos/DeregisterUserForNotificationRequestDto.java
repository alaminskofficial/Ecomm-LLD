package com.example.ecomm.dtos;

import lombok.Data;

@Data
public class DeregisterUserForNotificationRequestDto {
    private int userId;
    private int notificationId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getNotificationId() {
        return notificationId;
    }

    public void setNotificationId(int notificationId) {
        this.notificationId = notificationId;
    }
}
