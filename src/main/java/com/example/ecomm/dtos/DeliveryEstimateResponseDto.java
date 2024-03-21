package com.example.ecomm.dtos;

import lombok.Data;

import java.util.Date;

@Data
public class DeliveryEstimateResponseDto {
    private Date expectedDeliveryDate;
    private ResponseStatus responseStatus;

    public Date getExpectedDeliveryDate() {
        return expectedDeliveryDate;
    }

    public void setExpectedDeliveryDate(Date expectedDeliveryDate) {
        this.expectedDeliveryDate = expectedDeliveryDate;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }
}
