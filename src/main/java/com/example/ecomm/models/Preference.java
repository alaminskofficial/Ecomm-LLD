package com.example.ecomm.models;

import jakarta.persistence.Entity;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Preference extends BaseModel{
    private String category;
    private String description;
    private Date createdAt;

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
