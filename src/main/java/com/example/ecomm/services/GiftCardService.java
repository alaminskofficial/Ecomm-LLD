package com.example.ecomm.services;


import com.example.ecomm.exceptions.GiftCardDoesntExistException;
import com.example.ecomm.exceptions.GiftCardExpiredException;
import com.example.ecomm.models.GiftCard;


public interface GiftCardService {
    public GiftCard createGiftCard(double amount);

    public GiftCard redeemGiftCard(int giftCardId, double amountToRedeem) throws GiftCardDoesntExistException, GiftCardExpiredException;
}
