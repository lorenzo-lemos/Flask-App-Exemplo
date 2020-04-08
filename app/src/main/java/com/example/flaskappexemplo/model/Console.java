package com.example.flaskappexemplo.model;

public class Console {
    private long id;
    private String name;
    private int year;
    private double price;
    private String active_sale;
    private int amount_games;

    public Console() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getActiveSale() {
        return name;
    }

    public void setActiveSale(String active_sale) {
        this.active_sale = active_sale;
    }

    public int getAmountGames() {
        return year;
    }

    public void setAmountGames(int amount_games) {
        this.amount_games = amount_games;
    }

    @Override
    public String toString() {
        return name;
    }
}
