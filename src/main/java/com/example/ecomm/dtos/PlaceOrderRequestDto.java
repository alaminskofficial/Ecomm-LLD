package com.example.ecomm.dtos;

import lombok.Data;
import org.springframework.data.util.Pair;

import java.util.List;

@Data
public class PlaceOrderRequestDto {
    private int userId;
    private int addressId;
    private List<Pair<Integer, Integer>> orderDetails;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public List<Pair<Integer, Integer>> getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(List<Pair<Integer, Integer>> orderDetails) {
        this.orderDetails = orderDetails;
    }
}
