package com.technical.request.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity
@Getter
public class Customer {
    private int id;
    private String name;
    private String lastName;
    private String maternalLastName;

    public Customer() {
        this.id = 1;
        this.name = "PERLA TOMASA";
        this.lastName = "CABRERA";
        this.maternalLastName = "ROMAN";
    }
}
