package com.example.ecomm.repositories;


import com.example.ecomm.models.Notification;
import com.example.ecomm.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NotificationRepository extends JpaRepository<Notification, Integer> {

    List<Notification> findByProduct(Product product);

}
