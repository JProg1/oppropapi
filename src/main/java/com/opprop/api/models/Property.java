package com.opprop.api.models;

import jakarta.persistence.*;
import org.springframework.boot.context.properties.bind.DefaultValue;

@Entity
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private long customer_ref;

    private String status;

    private double asking_price;

    private String addr_no, addr_line_1, addr_town, addr_postcode, image, type;

    private int bedrooms, bathrooms;

    private boolean garden, garage;

    public Property() {

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCustomer_ref() {
        return customer_ref;
    }

    public void setCustomer_ref(long customer_ref) {
        this.customer_ref = customer_ref;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getAsking_price() {
        return asking_price;
    }

    public void setAsking_price(double asking_price) {
        this.asking_price = asking_price;
    }

    public String getAddr_no() {
        return addr_no;
    }

    public void setAddr_no(String addr_no) {
        this.addr_no = addr_no;
    }

    public String getAddr_line_1() {
        return addr_line_1;
    }

    public void setAddr_line_1(String addr_line_1) {
        this.addr_line_1 = addr_line_1;
    }

    public String getAddr_town() {
        return addr_town;
    }

    public void setAddr_town(String addr_town) {
        this.addr_town = addr_town;
    }

    public String getAddr_postcode() {
        return addr_postcode;
    }

    public void setAddr_postcode(String addr_postcode) {
        this.addr_postcode = addr_postcode;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(int bathrooms) {
        this.bathrooms = bathrooms;
    }

    public boolean isGarden() {
        return garden;
    }

    public void setGarden(boolean garden) {
        this.garden = garden;
    }

    public boolean isGarage() {
        return garage;
    }

    public void setGarage(boolean garage) {
        this.garage = garage;
    }
}
