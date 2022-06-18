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
public class SaldoNasabah {

    public static void main(String[] args) {
        
        double saldo, setoran;

        Scanner in = new Scanner(System.in);

        saldo = in.nextDouble();
        setoran = in.nextDouble();

        operasiSaldo(saldo, setoran);
    }
    
    
    static double operasiSaldo(double saldo, double setoran){
        
        double kurang;
        kurang = (saldo + setoran) - 7000;

        double bunga;
        bunga = (0.05 * kurang) / 100;

        double totalAkhir;
        totalAkhir = kurang + bunga;
        System.out.println(totalAkhir);

        return totalAkhir;
    }
}
