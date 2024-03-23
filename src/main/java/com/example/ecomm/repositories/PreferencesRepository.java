package com.example.ecomm.repositories;


import com.example.ecomm.models.Preference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreferencesRepository extends JpaRepository<Preference, Integer> {
}
