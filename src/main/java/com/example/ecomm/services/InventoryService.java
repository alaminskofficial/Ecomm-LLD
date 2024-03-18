package com.example.ecomm.services;

import com.example.ecomm.exceptions.ProductNotFoundException;
import com.example.ecomm.exceptions.UnAuthorizedAccessException;
import com.example.ecomm.exceptions.UserNotFoundException;
import com.example.ecomm.models.Inventory;

public interface InventoryService {
    public Inventory createOrUpdateInventory(int userId, int productId, int quantity) throws ProductNotFoundException, UserNotFoundException, UnAuthorizedAccessException;
    public void deleteInventory(int userId, int productId) throws UserNotFoundException, UnAuthorizedAccessException;
}
