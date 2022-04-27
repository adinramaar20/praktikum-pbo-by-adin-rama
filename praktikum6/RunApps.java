package tugas.java;

import java.util.Scanner;
import java.util.ArrayList;

public class RunApps {

    private Scanner scn = new Scanner(System.in);
    
    private boolean hold = true;
    private int pilih, ulang;
    private String[] daftarMenu;

    // membuat instansiasi dari objek class yang telah dibuat
    private ArrayList<Manusia> manusia;
    private ArrayList<MahasiswaFilkom> mhsFilkom;
    private ArrayList<Pekerja> pekerja;
    private ArrayList<Manager> manager;

    RunApps(){
        manusia = new ArrayList<>();
        mhsFilkom = new ArrayList<>();
        pekerja = new ArrayList<>();
        manager = new ArrayList<>();
        
        daftarMenu = new String[6];
        daftarMenu[0] = "1. MANUSIA";
        daftarMenu[1] = "2. MAHASISWA FILKOM";
        daftarMenu[2] = "3. PEKERJA";
        daftarMenu[3] = "4. MANAGER";
        daftarMenu[4] = "0. KELUAR";
    }

    public void display(){
        String nama, NIK, NIM, NIP;
        int jam, hari, lamaKerja;
        double IPK;
        boolean jenisKel, menikah;

        while (hold){
            System.out.println("\nDAFTAR PILIHAN :");
            System.out.println("----------------------");
            for (String daftar : daftarMenu){
                if (daftar != null){
                    System.out.println(daftar);
                }
            }
            System.out.println("----------------------");
            System.out.print("INPUTKAN PILIHAN = ");
            pilih = scn.nextInt();
            
            switch (pilih) {
                case 0 :
                    System.out.println("ANDA TELAH KELUAR DARI PROGRAM");
                    hold = false;
                    break;

                case 2 :
                    System.out.println("\n=== CLASS MAHASISWA FILKOM ===");
                    System.out.print("MASUKKAN JUMLAH PENGULANGAN INPUTAN = ");
                    ulang = scn.nextInt();

                    for (int i = 0; i < ulang; i++) {
                        System.out.print("INPUT NAMA " + (i+1) + " : ");
                        scn.nextLine();
                        nama = scn.nextLine();
                        System.out.print("INPUT NIK " + (i+1) + ": ");
                        NIK = scn.next();
                        System.out.print("INPUT NIM " + (i+1) + " : ");
                        NIM = scn.next();
                        System.out.print("INPUT IPK " + (i+1) + " : ");
                        IPK = scn.nextDouble();
                        scn.nextLine();
                        System.out.print("INPUT JENIS KELAMIN (true=LAKI-LAKI || false=PEREMPUAN) " + (i+1) + " : ");
                        jenisKel = scn.nextBoolean();
                        System.out.print("INPUT STATUS MENIKAH (true=SUDAH || false=BELUM) " + (i+1) + " : ");
                        menikah = scn.nextBoolean();

                        mhsFilkom.add(new MahasiswaFilkom(nama, NIK, jenisKel, menikah, NIM, IPK));
                    }

                    for (MahasiswaFilkom mhs : mhsFilkom)
                        if (mhs != null)
                            System.out.println(mhs);
                    break;

                case 1 :
                    System.out.println("\n=== CLASS MANUSIA ===");
                    System.out.print("MASUKKAN JUMLAH PENGULANGAN INPUTAN = ");
                    ulang = scn.nextInt();

                    for (int i = 0; i < ulang; i++) {
                        System.out.print("INPUT NAMA " + (i+1) + " : ");
                        scn.nextLine();
                        nama = scn.nextLine();
                        System.out.print("INPUT NIK " + (i+1) + ": ");
                        NIK = scn.next();
                        System.out.print("INPUT JENIS KELAMIN (true=LAKI-LAKI || false=PEREMPUAN) " + (i+1) + " : ");
                        jenisKel = scn.nextBoolean();
                        System.out.print("INPUT STATUS MENIKAH (true=SUDAH || false=BELUM) " + (i+1) + " : ");
                        menikah = scn.nextBoolean();

                        manusia.add(new Manusia(nama, NIK, jenisKel, menikah));
                    }
                    
                    for (Manusia man : manusia)
                        if (man != null)
                            System.out.println(man);
                    break;

                case 3 :
                    System.out.println("\n=== CLASS PEKERJA ===");
                    System.out.print("MASUKKAN JUMLAH PENGULANGAN INPUTAN = ");
                    ulang = scn.nextInt();

                    for (int i = 0; i < ulang; i++) {
                        System.out.print("INPUT JAM KERJA " + (i+1) + " : ");
                        jam = scn.nextInt();
                        System.out.print("INPUT HARI KERJA " + (i+1) + " : ");
                        hari = scn.nextInt();
                        System.out.print("INPUT NIP " + (i+1) + " : ");
                        NIP = scn.next();
                        System.out.print("INPUT NAMA " + (i+1) + " : ");
                        scn.nextLine();
                        nama = scn.nextLine();
                        System.out.print("INPUT NIK " + (i+1) + ": ");
                        NIK = scn.next();
                        System.out.print("INPUT JENIS KELAMIN (true=LAKI-LAKI || false=PEREMPUAN) " + (i+1) + " : ");
                        jenisKel = scn.nextBoolean();
                        System.out.print("INPUT STATUS MENIKAH (true=SUDAH || false=BELUM) " + (i+1) + " : ");
                        menikah = scn.nextBoolean();

                        pekerja.add(new Pekerja(jam, hari, NIP, nama, NIK, jenisKel, menikah));
                    }

                    for (Pekerja pkj : pekerja)
                        if (pkj != null)
                            System.out.println(pkj);
                    break;

                case 4 :
                    System.out.println("\n=== CLASS MANAGER ===");
                    System.out.print("MASUKKAN JUMLAH PENGULANGAN INPUTAN = ");
                    ulang = scn.nextInt();

                    for (int i = 0; i < ulang; i++) {
                        System.out.print("INPUT JAM KERJA " + (i+1) + " : ");
                        jam = scn.nextInt();
                        System.out.print("INPUT HARI KERJA " + (i+1) + " : ");
                        hari = scn.nextInt();
                        System.out.print("INPUT NIP " + (i+1) + " : ");
                        NIP = scn.next();
                        System.out.print("INPUT NAMA " + (i+1) + " : ");
                        scn.nextLine();
                        nama = scn.nextLine();
                        System.out.print("INPUT NIK " + (i+1) + ": ");
                        NIK = scn.next();
                        System.out.print("INPUT JENIS KELAMIN (true=LAKI-LAKI || false=PEREMPUAN) " + (i+1) + " : ");
                        jenisKel = scn.nextBoolean();
                        System.out.print("INPUT STATUS MENIKAH (true=SUDAH || false=BELUM) " + (i+1) + " : ");
                        menikah = scn.nextBoolean();
                        System.out.print("INPUT LAMA KERJA " + (i+1) + " : ");
                        lamaKerja = scn.nextInt();

                        manager.add(new Manager(jam, hari, NIP, nama, NIK, jenisKel, menikah, lamaKerja));
                    }

                    for (Manager mng : manager)
                        if (mng != null)
                            System.out.println(mng);
                    break;

                default :
                    System.out.println("INPUT SALAH, SILAHKAN ULANG");
                    continue;
            }

        }
    }

}
