package com.example.ecomm.models;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class LedgerEntry extends BaseModel{

    private TransactionType transactionType;
    private double amount;
    private Date createdAt;

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(TransactionType transactionType) {
        this.transactionType = transactionType;
    }

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
}
