package com.example.ecomm.repositories;


import com.example.ecomm.models.DeliveryHub;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DeliveryHubRepository extends JpaRepository<DeliveryHub, Integer> {

    @EntityGraph(attributePaths = "address")
    Optional<DeliveryHub> findByAddress_ZipCode(String zipCode);
}
