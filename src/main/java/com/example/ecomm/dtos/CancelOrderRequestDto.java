package com.example.ecomm.dtos;

import lombok.Data;

@Data
public class CancelOrderRequestDto {
    private int orderId;
    private int userId;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
