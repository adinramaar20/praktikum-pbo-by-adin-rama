/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arraylist;

/**
 *
 * @author Asus
 */
public class CarRent {

    private Car car;
    private CarRider rider;
    private int rentDur;

    public CarRent(Car car, CarRider rider, int rentDur){
        this.car = car;
        this.rider = rider;
        this.rentDur = rentDur;
    }

    public Car getCar() {
        return car;
    }

    public int getRentDur() {
        return rentDur;
    }

    public CarRider getRider() {
        return rider;
    }
}
