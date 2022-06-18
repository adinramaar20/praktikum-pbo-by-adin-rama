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
class Manusia {
    
    private String nama, NIK;
    private boolean jenisKelamin, menikah;

    Manusia(String nama, String NIK, boolean jk, boolean menikah){
        setNama(nama);
        setNIK(NIK);
        setJenisKelamin(jk);
        setMenikah(menikah);
    }

    // setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }

    // getter
    public String getNama() {
        return this.nama;
    }

    public String getNIK() {
        return this.NIK;
    }

    public String getJenisKelamin() {
        if (jenisKelamin == true) {
            return "Laki-Laki";
        } else {
            return "Perempuan";
        }
    }

    public boolean getMenikah() {
        return this.menikah;
    }

    public double getTunjangan() {
        if (getMenikah()== true && jenisKelamin == true) {
            return 25.0;
        } else if (getMenikah() == true && jenisKelamin == false) {
            return 20.0;
        } else {
            return 15.0;
        }
    }

    public double getPendapatan() {
        return getTunjangan();
    }

    public String toString() {
        return "\nNama\t\t\t: " + getNama() + "\nNIK\t\t\t\t: " + getNIK() + "\nJenis Kelamin\t: " + getJenisKelamin() + "\nPendapatan\t\t: " + getPendapatan() + "$";
    }
}
