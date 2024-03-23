package com.example.ecomm.models;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity(name = "users")
public class User extends BaseModel{
    private String name;
    private String email;
    @Enumerated(value = EnumType.ORDINAL)
    private UserType userType;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Preference> preferences;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public List<Preference> getPreferences() {
        return preferences;
    }

    public void setPreferences(List<Preference> preferences) {
        this.preferences = preferences;
    }
}
