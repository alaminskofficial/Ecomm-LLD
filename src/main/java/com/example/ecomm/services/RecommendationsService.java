package com.example.ecomm.services;



import com.example.ecomm.exceptions.ProductNotFoundException;
import com.example.ecomm.models.Product;

import java.util.List;

public interface RecommendationsService {

    public List<Product> getRecommendations(int productId) throws ProductNotFoundException;
}
