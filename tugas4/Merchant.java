package uts.praktikum.tugas4;

class Merchant {

    private String namaMerchant, namaProduk;
    private double hargaMakanan;

    public Merchant(String namaMerchant, String namaProduk, double hargaMakanan){
        this.namaMerchant = namaMerchant;
        this.namaProduk = namaProduk;
        this.hargaMakanan = hargaMakanan;
    }

    public Merchant(){}

    String getNamaMerchant() {
        return namaMerchant;
    }

    void setNamaMerchant(String namaMerchant) {
        this.namaMerchant = namaMerchant;
    }

    String getNamaProduk() {
        return namaProduk;
    }

    void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }

    double getHargaMakanan() {
        return hargaMakanan;
    }

    void setHargaMakanan(double hargaMakanan) {
        this.hargaMakanan = hargaMakanan;
    }
}
