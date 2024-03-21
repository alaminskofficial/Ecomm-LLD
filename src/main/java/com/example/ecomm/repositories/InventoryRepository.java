package com.example.ecomm.repositories;

import com.example.ecomm.models.Inventory;
import com.example.ecomm.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Integer> {
    Optional<Inventory> findByProductId(int productId);

    List<Inventory> findAllByProductIdIn(List<Integer> list);
    Optional<Inventory> findByProduct(Product product);
}
