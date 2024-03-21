package com.example.ecomm.services;


import com.example.ecomm.exceptions.*;
import com.example.ecomm.models.Notification;

public interface NotificationService {

    public Notification registerUser(int userId, int productId) throws UserNotFoundException, ProductNotFoundException, ProductInStockException;

    public void deregisterUser(int userId, int notificationId) throws UserNotFoundException, NotificationNotFoundException, UnAuthorizedException;
}
