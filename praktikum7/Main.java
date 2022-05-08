package tugas.java;

public class Main {
    public static void main(String[] args) {

        RunApps pegawai1 = new RunApps(new PegawaiTetap("Rama", "3504162010020069", 4500000));
        System.out.print("\n");

        RunApps pegawai2 = new RunApps(new PegawaiHarian("Satrio", "35041620020045", 8500, 40));
        System.out.print("\n");

        RunApps pegawai3 = new RunApps(new Sales("Andi", "35041615030012", 50, 50000));
        System.out.print("\n");

        RunApps pegawai4 = new RunApps(new PegawaiHarian("Bagus", "35041609090005", 10000, 45));
        System.out.print("\n");

        RunApps pegawai5 = new RunApps(new Sales("Riana", "35041619070006", 48, 35000));
    }
}
