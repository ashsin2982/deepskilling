package com.example.countryxml.model;

public class Country {

    private int id;
    private String name;
    private String capital;

    public Country() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Capital: " + capital;
    }
}