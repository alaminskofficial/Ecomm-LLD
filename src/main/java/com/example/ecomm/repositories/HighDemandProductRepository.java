package com.example.ecomm.repositories;


import com.example.ecomm.models.HighDemandProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HighDemandProductRepository extends JpaRepository<HighDemandProduct, Integer> {

    List<HighDemandProduct> findAllByProductIdIn(List<Integer> ids);

}
