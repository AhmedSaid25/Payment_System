package com.example.demo.service;


public class Internet implements IService {

    double cost=30.0;
    public Internet(){
        System.out.println("you should pay 30 dollar for Internet");
    }

    @Override
    public double getcost() {
        return cost ;
    }

}