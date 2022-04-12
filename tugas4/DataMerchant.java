package uts.praktikum.tugas4;

import java.util.ArrayList;
import java.util.List;

class DataMerchant {

    private static List<Merchant> merc = new ArrayList<>();
    private static Merchant merchant1 = new Merchant();

    public static List<Merchant> tambahMerchant(Merchant merchant){
        merc.add(merchant);
        return merc;
    }

    public static void tampilData(){
        for (Merchant merchant : merc){
            System.out.println("====Tampilan Data Merchant UBFood====");
            System.out.println("Nama Merchant   : " + merchant.getNamaMerchant());
            System.out.println("Nama Produk     : " + merchant.getNamaProduk());
            System.out.println("Harga           : " + (int) merchant.getHargaMakanan());
        }
    }

    public static Merchant cariMerchant(String name){
        for (Merchant merchant : merc){
            if (merchant.getNamaMerchant().equals(name)){
                System.out.println("Data merchant atas nama " + name + " ditemukan");
                return merchant;
            }
        }
        System.out.println("Data merchant atas nama " + name + " tidak ditemukan");
        return merchant1;
    }

    public static void tampilMerchant(Merchant merchant){
        System.out.println("Nama Merchant   : " + merchant.getNamaMerchant());
        System.out.println("Nama Produk     : " + merchant.getNamaProduk());
        System.out.println("Harga           : " + (int) merchant.getHargaMakanan());
    }

    public static void updateMerchant(Merchant merchant, String name, String product, double price){
        merchant.setNamaMerchant(name);
        merchant.setNamaProduk(product);
        merchant.setHargaMakanan(price);
    }
}
