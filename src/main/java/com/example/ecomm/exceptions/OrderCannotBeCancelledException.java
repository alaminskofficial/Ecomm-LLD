package com.example.ecomm.exceptions;

public class OrderCannotBeCancelledException extends Exception {
    public OrderCannotBeCancelledException(String message) {
        super(message);
    }
}
