package com.example.androidcarmanager.Database;

public class Expence_DB {
    String expenseTitle;
    Long date, time;
    Double odometer, price,liter;
    String images;

    public Expence_DB() {
    }
//other expences

    public Expence_DB(String expenseTitle, Long date, Long time, Double odometer, Double price) {
        this.expenseTitle = expenseTitle;
        this.date = date;
        this.time = time;
        this.odometer = odometer;
        this.price = price;
    }

    //odomeeter
    public Expence_DB(Long date, Long time, Double odometer) {
        this.date = date;
        this.time = time;
        this.odometer = odometer;
    }
//fuel
    public Expence_DB(String expenseTitle, Long date, Long time, Double odometer, Double price, Double liter) {
        this.expenseTitle = expenseTitle;
        this.date = date;
        this.time = time;
        this.odometer = odometer;
        this.price = price;
        this.liter = liter;
    }
//for images


    public Expence_DB(String expenseTitle, Long date, Long time, Double odometer, Double price, String images) {
        this.expenseTitle = expenseTitle;
        this.date = date;
        this.time = time;
        this.odometer = odometer;
        this.price = price;
        this.images = images;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getExpenseTitle() {
        return expenseTitle;
    }

    public void setExpenseTitle(String expenseTitle) {
        this.expenseTitle = expenseTitle;
    }

    public Long getDate() {
        return date;
    }

    public void setDate(Long date) {
        this.date = date;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public Double getOdometer() {
        return odometer;
    }

    public void setOdometer(Double odometer) {
        this.odometer = odometer;
    }

    public Double getliter() {
        return liter;
    }

    public void setliter(Double liter) {
        this.liter = liter;
    }

    public Double getCost() {
        return price;
    }

    public void setCost(Double cost) {
        this.price = cost;
    }
}

