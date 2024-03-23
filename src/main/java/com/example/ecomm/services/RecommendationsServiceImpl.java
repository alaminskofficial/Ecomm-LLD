package com.example.ecomm.services;


import com.example.ecomm.exceptions.ProductNotFoundException;
import com.example.ecomm.models.Product;
import com.example.ecomm.models.ProductGroup;
import com.example.ecomm.repositories.ProductGroupsRepository;
import com.example.ecomm.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class RecommendationsServiceImpl implements RecommendationsService{

    private ProductRepository productRepository;
    private ProductGroupsRepository productGroupsRepository;

    @Autowired
    public RecommendationsServiceImpl(ProductRepository productRepository, ProductGroupsRepository productGroupsRepository) {
        this.productRepository = productRepository;
        this.productGroupsRepository = productGroupsRepository;
    }

    @Override
    public List<Product> getRecommendations(int productId) throws ProductNotFoundException {
        Optional<Product> productOptional = productRepository.findById(productId);

        if (productOptional.isEmpty()) {
            throw new ProductNotFoundException("Product not found");
        }
        Product product = productOptional.get();

        List<ProductGroup> productGroupList = productGroupsRepository.findByProductsContaining(product);

        return productGroupList.stream()
                .flatMap(productGroup -> productGroup.getProducts().stream())
                .distinct()
                .filter(product1 -> product1.getId() != productId)
                .collect(Collectors.toList());
    }
}
