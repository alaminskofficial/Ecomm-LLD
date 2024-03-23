package com.example.ecomm.dtos;

import lombok.Data;

@Data
public class GetAdvertisementForUserRequestDto {
    private int userId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
