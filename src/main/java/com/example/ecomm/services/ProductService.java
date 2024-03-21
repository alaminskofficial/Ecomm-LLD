package com.example.ecomm.services;



import com.example.ecomm.exceptions.AddressNotFoundException;
import com.example.ecomm.exceptions.ProductNotFoundException;

import java.util.Date;

public interface ProductService {
    public Date estimateDeliveryDate(int productId, int addressId) throws ProductNotFoundException, AddressNotFoundException;
}
