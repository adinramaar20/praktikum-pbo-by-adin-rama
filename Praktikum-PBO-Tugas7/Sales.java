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
public class Sales extends Pegawai {
    
    private double komisi;
    private int penjualan;

    Sales(String nama, String noKTP, int penjualan, double komisi){
        super(nama, noKTP);
        setKomisi(komisi);
        setPenjualan(penjualan);
    }

    // setter
    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    // getter
    public double getKomisi() {
        return komisi;
    }

    public int getPenjualan() {
        return penjualan;
    }

    public int pendapatan() {
        double x = getPenjualan() * getKomisi();
        return (int) x;
    }

    @Override
    public String toString(){
        System.out.println("= = =  SALES  = = =");
        System.out.println("Sales\t\t\t: " + getNama());
        System.out.println("Nomor KTP\t\t: " + getNoKTP());
        System.out.println("Total penjualan\t: " + getPenjualan());
        System.out.println("Besaran komisi\t: " + getKomisi());
        System.out.println("Pendapatan\t\t: Rp " + pendapatan());
        return " ";
    }
}
