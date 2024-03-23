package com.example.ecomm.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
public class GiftCard extends BaseModel{
    private double amount;
    private Date createdAt;
    private Date expiresAt;
    @OneToMany(fetch = FetchType.EAGER)
    private List<LedgerEntry> ledger;
    private String giftCardCode;

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getExpiresAt() {
        return expiresAt;
    }

    public void setExpiresAt(Date expiresAt) {
        this.expiresAt = expiresAt;
    }

    public List<LedgerEntry> getLedger() {
        return ledger;
    }

    public void setLedger(List<LedgerEntry> ledger) {
        this.ledger = ledger;
    }

    public String getGiftCardCode() {
        return giftCardCode;
    }

    public void setGiftCardCode(String giftCardCode) {
        this.giftCardCode = giftCardCode;
    }
}
