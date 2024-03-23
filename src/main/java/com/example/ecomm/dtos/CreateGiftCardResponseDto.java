package com.example.ecomm.dtos;


import com.example.ecomm.models.GiftCard;
import lombok.Data;

@Data
public class CreateGiftCardResponseDto {
    private GiftCard giftCard;
    private ResponseStatus responseStatus;

    public GiftCard getGiftCard() {
        return giftCard;
    }

    public void setGiftCard(GiftCard giftCard) {
        this.giftCard = giftCard;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }
}
