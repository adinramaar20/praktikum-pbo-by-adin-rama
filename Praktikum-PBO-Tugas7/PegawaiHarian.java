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
public class PegawaiHarian extends Pegawai {
    
    private double upahPerJam;
    private int totalJam;

    PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam){
        super(nama, noKTP);
        setUpahPerJam(upahPerJam);
        setTotalJam(totalJam);
    }

    // setter
    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }

    // getter
    public double getUpahPerJam() {
        return this.upahPerJam;
    }

    public int getTotalJam() {
        return this.totalJam;
    }

    public int pendapatan(){
        if (totalJam <= 40){
            this.upahPerJam = upahPerJam * totalJam;
            return (int) this.upahPerJam;
        
        } else if (totalJam > 40){
            this.upahPerJam = (upahPerJam*40) + (totalJam-40)*upahPerJam*1.5;
            return (int) this.upahPerJam;
        
        } else {
            this.upahPerJam = 0;
            return (int) this.upahPerJam;
        }
    }

    @Override
    public String toString(){
        System.out.println("= = =  PEGAWAI HARIAN  = = =");
        System.out.println("Pegawai harian\t: " + getNama());
        System.out.println("Nomor KTP\t\t: " + getNoKTP());
        System.out.println("Upah/jam\t\t: " + getUpahPerJam());
        System.out.println("Total jam kerja\t: " + getTotalJam());
        System.out.println("Pendapatan\t\t: Rp " + pendapatan());
        return " ";
    }
}
