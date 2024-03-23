package com.example.ecomm.dtos;

import lombok.Data;

@Data
public class RedeemGiftCardRequestDto {
    private double amountToRedeem;
    private int giftCardId;

    public double getAmountToRedeem() {
        return amountToRedeem;
    }

    public void setAmountToRedeem(double amountToRedeem) {
        this.amountToRedeem = amountToRedeem;
    }

    public int getGiftCardId() {
        return giftCardId;
    }

    public void setGiftCardId(int giftCardId) {
        this.giftCardId = giftCardId;
    }
}
