package com.example.ecomm.repositories;


import com.example.ecomm.models.LedgerEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LedgerEntryRepository extends JpaRepository<LedgerEntry, Integer> {
}
