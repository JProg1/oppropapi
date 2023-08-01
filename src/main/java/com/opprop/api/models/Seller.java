package com.opprop.api.models;

import jakarta.persistence.*;
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Entity
public class Seller {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String title, first_name, surname, email, phone, addr_no, addr_line_1, addr_town, addr_postcode;


    public Seller() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

}
