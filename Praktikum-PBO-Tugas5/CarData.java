/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.arraylist;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class CarData {

    List<Car> carList = new ArrayList<>();

    public void addCar(String carType, String polNum, String merk){
        carList.add(new Car(carType, polNum, merk, true));
    }

    public void listOfCar(){
        System.out.println("-------------------------------");
        System.out.println("DAFTAR MOBIL");
        System.out.println("-------------------------------");

        for (Car car : carList){
            System.out.println("TIPE MOBIL : " + car.getCarType());
            System.out.println("NO POLISI  : " + car.getPolNum());
            System.out.println("MERK MOBIL : " + car.getMerk());
            System.out.println("-------------------------------\n");
        }
    }
}
