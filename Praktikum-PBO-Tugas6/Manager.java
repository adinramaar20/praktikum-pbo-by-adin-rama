/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inheritance;

/**
 *
 * @author Asus
 */
class Manager extends Pekerja {
    
    private int lamaKerja;

    Manager(int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean jk, boolean menikah, int lamaKerja){
        super(hariKerja, jamKerja, NIP, nama, NIK, jk, menikah);
        setLamaKerja(lamaKerja);
    }

    // setter
    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }

    // getter
    public int getLamaKerja() {
        return lamaKerja;
    }

    @Override
    public double getTunjangan() {
        // TODO Auto-generated method stub
        return super.getTunjangan() + 15;
    }

    @Override
    public double getBonus() {
        // TODO Auto-generated method stub
        return super.getBonus() + (super.getBonus() * (30/100));
    }

    @Override
    public String toString() {
        return super.toString() + "\nLama kerja\t\t: " + getLamaKerja() + " hari";
    }
}
