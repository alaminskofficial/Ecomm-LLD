package com.example.ecomm.dtos;

import lombok.Data;

@Data
public class GenerateRecommendationsRequestDto {

    private int productId;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }
}
