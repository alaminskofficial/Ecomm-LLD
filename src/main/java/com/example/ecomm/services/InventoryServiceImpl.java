package com.example.ecomm.services;

import com.example.ecomm.exceptions.ProductNotFoundException;
import com.example.ecomm.exceptions.UnAuthorizedAccessException;
import com.example.ecomm.exceptions.UserNotFoundException;
import com.example.ecomm.models.Inventory;
import com.example.ecomm.models.Product;
import com.example.ecomm.models.User;
import com.example.ecomm.models.UserType;
import com.example.ecomm.repositories.InventoryRepository;
import com.example.ecomm.repositories.ProductRepository;
import com.example.ecomm.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class InventoryServiceImpl implements InventoryService{

    private UserRepository userRepository;
    private InventoryRepository inventoryRepository;
    private ProductRepository productRepository;

    @Autowired
    public InventoryServiceImpl(UserRepository userRepository, InventoryRepository inventoryRepository, ProductRepository productRepository) {
        this.userRepository = userRepository;
        this.inventoryRepository = inventoryRepository;
        this.productRepository = productRepository;
    }

    @Override
    public Inventory createOrUpdateInventory(int userId, int productId, int quantity) throws ProductNotFoundException, UserNotFoundException, UnAuthorizedAccessException {
        User user = userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException("User not found. try with different user"));
        if(!user.getUserType().equals(UserType.ADMIN)){
            throw new UnAuthorizedAccessException("Only admins can create or update inventory..");
        }
        Optional<Inventory> inventoryOptional = inventoryRepository.findByProductId(productId);
        if(inventoryOptional.isEmpty()){
            Product product = this.productRepository.findById(productId).orElseThrow(() -> new ProductNotFoundException("Product not found"));
            Inventory inventory = new Inventory();
            inventory.setProduct(product);
            inventory.setQuantity(quantity);
            return inventoryRepository.save(inventory);
        } else{
            Inventory inventory = inventoryOptional.get();
            inventory.setQuantity(inventory.getQuantity() + quantity);
            return inventoryRepository.save(inventory);
        }
    }

    @Override
    public void deleteInventory(int userId, int productId) throws UserNotFoundException, UnAuthorizedAccessException {
        User user = userRepository.findById(userId).orElseThrow(() -> new UserNotFoundException("User not found . try with different user"));
        if(!user.getUserType().equals(UserType.ADMIN)){
            throw new UnAuthorizedAccessException("Only admins can delete inventory");
        }
        Optional<Inventory> inventoryOptional = inventoryRepository.findByProductId(productId);
        if(inventoryOptional.isPresent()){
            Inventory inventory = inventoryOptional.get();
            inventoryRepository.delete(inventory);
        }
    }
}
