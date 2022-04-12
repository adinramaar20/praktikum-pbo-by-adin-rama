package uts.praktikum;

import java.util.Scanner;

class Persegi {

    private int sisi;

    Persegi(int sisi){
        this.sisi = sisi;
    }

    int luasPersegi(){
        int hasil = this.sisi * this.sisi;
        return hasil;
    }
}

class Segitiga {

    private int alas, tinggi;

    Segitiga(int alas, int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    int luasSegitiga(){
        int hasil = (this.alas * this.tinggi) / 2;
        return hasil;
    }
}

class Lingkaran {

    private double jariJari;

    Lingkaran(double jariJari){
        this.jariJari = jariJari;
    }

    double luasLingkaran1(){
        double hasil = 22/7 * jariJari * jariJari;
        return hasil;
    }

    double luasLingkaran2(){
        double hasil = 3.14 * jariJari * jariJari;
        int cast = (int) hasil;
        return cast;
    }
}

public class Tugas2 {
    public static void main(String[] args) {
        
        int x,y;
        double z;

        Scanner input = new Scanner(System.in);
        int pilih = input.nextInt();

        if (pilih == 1){
            x = input.nextInt();
            Persegi bangunPersegi = new Persegi(x);
            System.out.println(bangunPersegi.luasPersegi());

        } else if (pilih == 2){
            x = input.nextInt();
            y = input.nextInt();
            Segitiga bangunSegitiga = new Segitiga(x,y);
            System.out.println(bangunSegitiga.luasSegitiga());

        } else if (pilih == 3){
            z = input.nextDouble();
            Lingkaran bangunLingkaran = new Lingkaran(z);
            if (z % 7 == 0){
                System.out.println(bangunLingkaran.luasLingkaran1());
            } else {
                System.out.println(bangunLingkaran.luasLingkaran2());
            }

        } else {
            System.out.println("Input yang anda masukan tidak sesuai");
        }

    }
}
