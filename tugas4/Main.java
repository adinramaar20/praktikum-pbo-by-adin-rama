package uts.praktikum.tugas4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name, product;
        double price;

        Scanner scn = new Scanner(System.in);

        name = scn.nextLine();
        product = scn.nextLine();
        price = scn.nextDouble();

        DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));
        DataMerchant.tambahMerchant(new Merchant(name, product, price));

        DataMerchant.tampilData();
    }
}
