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
public class PegawaiTetap extends Pegawai {
    
    private double upah;

    PegawaiTetap(String nama, String noKTP, double upah){
        super(nama, noKTP);
        setUpah(upah);
    }

    // setter
    public void setUpah(double upah) {
        this.upah = upah;
    }

    // getter
    public double getUpah() {
        return this.upah;
    }

    public int pendapatan(){
        return (int) this.getUpah();
    }

    @Override
    public String toString() {
        System.out.println("= = =  PEGAWAI TETAP  = = =");
        System.out.println("Pegawai tetap\t: " + getNama());
        System.out.println("Nomor KTP\t\t: " + getNoKTP());
        System.out.println("Upah\t\t\t: " + getUpah());
        System.out.println("Pendapatan\t\t: Rp " + pendapatan());
        return " ";
    }
}
