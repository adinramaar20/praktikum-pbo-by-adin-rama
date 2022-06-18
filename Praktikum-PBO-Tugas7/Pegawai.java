/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.polimorfisme;

/**
 *
 * @author Asus
 */
public class Pegawai {
    
    private String nama;
    private String noKTP;

    Pegawai(String nama, String noKTP){
        this.nama = nama;
        this.noKTP = noKTP;
    }

    // getter
    public String getNama() {
        return this.nama;
    }

    public String getNoKTP() {
        return this.noKTP;
    }

    public double gaji(){
        return 0;
    }

    public String toString(){
        return " ";
    }
}
