package com.example.ecomm.libraries;



import com.example.ecomm.libraries.models.GLocation;

import java.util.Random;

public class GoogleMapsApi {

    public int estimate(GLocation src, GLocation dest) {
        // Call google maps service to get the number of seconds required to travel from src to dest
        Random random = new Random();
        return random.nextInt(100000000) + 1;
    }
}
