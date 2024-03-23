package com.example.ecomm.exceptions;

public class GiftCardDoesntExistException extends Exception{
    public GiftCardDoesntExistException(String message) {
        super(message);
    }
}
