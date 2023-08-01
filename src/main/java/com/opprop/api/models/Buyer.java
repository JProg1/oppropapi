package com.opprop.api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Buyer extends Seller {

    private double buyer_budget;

    public Buyer() {
    }

    public double getBuyer_budget() {
        return buyer_budget;
    }

    public void setBuyer_budget(double buyer_budget) {
        this.buyer_budget = buyer_budget;
    }
}
