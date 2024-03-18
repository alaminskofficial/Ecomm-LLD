package com.example.ecomm.dtos;

import lombok.Data;

@Data
public class DeleteInventoryRequestDto {
    private int userId;
    private int productId;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}
