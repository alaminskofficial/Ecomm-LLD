package com.example.ecomm.dtos;

import com.example.ecomm.models.Inventory;
import lombok.Data;

@Data
public class CreateOrUpdateResponseDto {
    private Inventory inventory;
    private ResponseStatus responseStatus;

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }
}
