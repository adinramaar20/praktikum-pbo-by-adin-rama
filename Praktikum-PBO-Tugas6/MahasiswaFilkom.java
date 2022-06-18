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
class MahasiswaFilkom extends Manusia {
    
    private String[] prodi;
    private String NIM;
    private double IPK;

    MahasiswaFilkom(String nama, String NIK, boolean jk, boolean menikah, String NIM, double IPK){
        super(nama, NIK, jk, menikah);
        setNIM(NIM);
        setIPK(IPK);

        prodi = new String[5];
        prodi[0] = "Teknik Meniup Gelembung";
        prodi[1] = "Teknik Berburu Ubur-Ubur";
        prodi[2] = "Sistem Perhamburgeran";
        prodi[3] = "Pendidikan Chum Bucket";
        prodi[4] = "Teknologi Telepon Kerang";
    }

    // setter
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    // getter
    public String getNIM() {
        return this.NIM;
    }

    public double getIPK() {
        return this.IPK;
    }

    public String getStatus(){
        char[] a = NIM.toCharArray();
        String b;

        if (a[6] == '2'){
            b = prodi[0].toString();

        } else if (a[6] == '3'){
            b = prodi[1].toString();

        } else if (a[6] == '4'){
            b = prodi[2].toString();

        } else if (a[6] == '6'){
            b = prodi[3].toString();

        } else if (a[6] == '7'){
            b = prodi[4].toString();

        } else {
            b = "Tidak ada prodi";
        }

        return b + ", 20" + getAngkatan();
    }

    public String getAngkatan(){
        String b = NIM.substring(0, 2);
        return b;
    }

    public double getBeasiswa(){
        if (3 <= IPK && IPK < 3.5) {
            return 50;
        } else if (3.5 <= IPK && IPK <= 4) {
            return 75;
        } else {
            return 0;
        }
    }

    @Override
    public double getPendapatan() {
        // TODO Auto-generated method stub
        return super.getPendapatan() + getBeasiswa();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "\nIPK\t\t\t\t: " + getIPK() + "\nNIM\t\t\t\t: " + getNIM() + "\nStatus\t\t\t: " + getStatus();
    }
}
