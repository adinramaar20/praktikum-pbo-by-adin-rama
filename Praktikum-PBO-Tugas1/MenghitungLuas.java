/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.pembenahan;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class MenghitungLuas {

    public static void main(String[] args) {
        
        int pilih, sisi, alas, tinggi;
        double jariJari;

        Scanner in = new Scanner(System.in);

        pilih = in.nextInt();

        if (pilih == 1){
            sisi = in.nextInt();
            System.out.println(luasPersegi(sisi));

        } else if (pilih == 2){
            alas = in.nextInt();
            tinggi = in.nextInt();
            System.out.println(luasSegitiga(alas,tinggi));

        } else if (pilih == 3){
            jariJari = in.nextInt();
            if (jariJari % 7 == 0){
                System.out.println(luasLingkaran1(jariJari));
            } else {
                System.out.println(luasLingkaran2(jariJari));
            }

        } else {
            System.out.println("Input yang anda masukan tidak sesuai");
        }
    }

    static int luasPersegi(int sisi){
        int luas = sisi * sisi;
        return luas;
    }

    static int luasSegitiga(int alas, int tinggi){
        int luas = (alas * tinggi) / 2;
        return luas;
    }

    static double luasLingkaran1(double jariJari){
        double luas;
        luas = 22/7 * jariJari * jariJari;
        return luas;
    }

    static double luasLingkaran2(double jariJari){
        double luas;
        luas = 3.14 * jariJari * jariJari;
        int cast = (int) luas;
        return cast;
    }
}
