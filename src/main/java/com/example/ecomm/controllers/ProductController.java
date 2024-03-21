package com.example.ecomm.controllers;



import com.example.ecomm.dtos.DeliveryEstimateRequestDto;
import com.example.ecomm.dtos.DeliveryEstimateResponseDto;
import com.example.ecomm.dtos.ResponseStatus;
import com.example.ecomm.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Date;

@Controller
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    public DeliveryEstimateResponseDto estimateDeliveryTime(DeliveryEstimateRequestDto requestDto){
        DeliveryEstimateResponseDto responseDto = new DeliveryEstimateResponseDto();
        try{
            Date estimateDeliveryDate = productService.estimateDeliveryDate(requestDto.getProductId(), requestDto.getAddressId());
            responseDto.setExpectedDeliveryDate(estimateDeliveryDate);
            responseDto.setResponseStatus(ResponseStatus.SUCCESS);
            return responseDto;
        } catch (Exception e){
            responseDto.setResponseStatus(ResponseStatus.FAILURE);
            return responseDto;
        }
    }
}
