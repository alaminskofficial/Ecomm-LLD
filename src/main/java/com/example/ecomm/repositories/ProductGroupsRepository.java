package com.example.ecomm.repositories;


import com.example.ecomm.models.Product;
import com.example.ecomm.models.ProductGroup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductGroupsRepository extends JpaRepository<ProductGroup, Integer> {

    public List<ProductGroup> findByProductsContaining(Product product);
}
