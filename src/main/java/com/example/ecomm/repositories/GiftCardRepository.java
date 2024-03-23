package com.example.ecomm.repositories;


import com.example.ecomm.models.GiftCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GiftCardRepository extends JpaRepository<GiftCard, Integer> {
}
