package com.example.ecomm.controllers;


import com.example.ecomm.dtos.*;
import com.example.ecomm.models.Order;
import com.example.ecomm.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class OrderController {

    private OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    public PlaceOrderResponseDto placeOrder(PlaceOrderRequestDto placeOrderRequestDto) {
        PlaceOrderResponseDto placeOrderResponseDto = new PlaceOrderResponseDto();
        try{
            Order order = orderService.placeOrder(placeOrderRequestDto.getUserId(), placeOrderRequestDto.getAddressId(), placeOrderRequestDto.getOrderDetails());
            placeOrderResponseDto.setOrder(order);
            placeOrderResponseDto.setStatus(ResponseStatus.SUCCESS);
            return placeOrderResponseDto;
        } catch (Exception e) {
            e.printStackTrace();
            placeOrderResponseDto.setStatus(ResponseStatus.FAILURE);
            return placeOrderResponseDto;
        }
    }
    public CancelOrderResponseDto cancelOrder(CancelOrderRequestDto cancelOrderRequestDto) {
        CancelOrderResponseDto cancelOrderResponseDto = new CancelOrderResponseDto();
        try{
            Order order = orderService.cancelOrder(cancelOrderRequestDto.getOrderId(), cancelOrderRequestDto.getUserId());
            cancelOrderResponseDto.setOrder(order);
            cancelOrderResponseDto.setStatus(ResponseStatus.SUCCESS);
            return cancelOrderResponseDto;
        } catch (Exception e) {
            e.printStackTrace();
            cancelOrderResponseDto.setStatus(ResponseStatus.FAILURE);
            return cancelOrderResponseDto;
        }
    }

}
