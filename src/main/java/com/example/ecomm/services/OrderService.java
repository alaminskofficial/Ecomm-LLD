package com.example.ecomm.services;


import com.example.ecomm.exceptions.*;
import com.example.ecomm.models.Order;
import org.springframework.data.util.Pair;

import java.util.List;

public interface OrderService {

    public Order placeOrder(int userId, int addressId, List<Pair<Integer, Integer>> orderDetails) throws UserNotFoundException, InvalidAddressException, OutOfStockException, InvalidProductException, HighDemandProductException;
    public Order cancelOrder(int orderId, int userId) throws UserNotFoundException, OrderNotFoundException, OrderDoesNotBelongToUserException, OrderCannotBeCancelledException;
}
