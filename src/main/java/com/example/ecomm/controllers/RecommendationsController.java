package com.example.ecomm.controllers;



import com.example.ecomm.dtos.GenerateRecommendationsRequestDto;
import com.example.ecomm.dtos.GenerateRecommendationsResponseDto;
import com.example.ecomm.dtos.ResponseStatus;
import com.example.ecomm.models.Product;
import com.example.ecomm.services.RecommendationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class RecommendationsController {

    private RecommendationsService recommendationsService;

    @Autowired
    public RecommendationsController(RecommendationsService recommendationsService) {
        this.recommendationsService = recommendationsService;
    }

    public GenerateRecommendationsResponseDto generateRecommendations(GenerateRecommendationsRequestDto requestDto) {
        GenerateRecommendationsResponseDto responseDto = new GenerateRecommendationsResponseDto();
        try{
            List<Product> recommendations = recommendationsService.getRecommendations(requestDto.getProductId());
            responseDto.setRecommendations(recommendations);
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
            return responseDto;
        } catch (Exception e) {
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
            return responseDto;
        }
    }
}
