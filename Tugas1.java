package uts.praktikum;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String kataMasukan = in.nextLine();
        int jumlahPergeseran = in.nextInt();

        String kataKeluaran = "";

        char alphabet;
        for (int i = 0; i < kataMasukan.length(); i++) {
            alphabet = kataMasukan.charAt(i);

            // jika input dengan huruf kecil
            if (alphabet >= 'a' && alphabet <= 'z'){
                alphabet = (char) (alphabet + jumlahPergeseran);

                if (alphabet > 'z'){
                    hurufKecil(alphabet);
                }
                kataKeluaran += alphabet;
            
            // jika input dengan huruf besar    
            } else if (alphabet >= 'A' && alphabet <= 'Z'){
                alphabet = (char) (alphabet + jumlahPergeseran);

                if (alphabet > 'z'){
                    hurufBesar(alphabet);
                }
                kataKeluaran += alphabet;

            } else {
                kataKeluaran += alphabet;
            }
        }
        System.out.println(kataKeluaran);
    }

    private static void hurufKecil(char alphabet){
        alphabet = (char) (alphabet + 'a' - 'z' - 1);
    }

    private static void hurufBesar(char alphabet){
        alphabet = (char) (alphabet + 'A' - 'Z' - 1);
    }
}
