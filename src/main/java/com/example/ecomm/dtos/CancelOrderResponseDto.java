package com.example.ecomm.dtos;


import com.example.ecomm.models.Order;
import lombok.Data;

@Data
public class CancelOrderResponseDto {
    private ResponseStatus status;
    private Order order;

    public ResponseStatus getStatus() {
        return status;
    }

    public void setStatus(ResponseStatus status) {
        this.status = status;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
}
