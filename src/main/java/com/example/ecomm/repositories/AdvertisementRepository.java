package com.example.ecomm.repositories;


import com.example.ecomm.models.Advertisement;
import com.example.ecomm.models.Preference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdvertisementRepository extends JpaRepository<Advertisement, Integer> {

    public List<Advertisement> findAdvertisementsByPreferenceIn(List<Preference> preferences);
}
