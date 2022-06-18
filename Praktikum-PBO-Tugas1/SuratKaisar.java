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
public class SuratKaisar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kata = sc.nextLine();
        int nilaiPindah = sc.nextInt();
        sandiSurat(kata,nilaiPindah);
    }
    public static void sandiSurat(String kata, int nilaiPindah){
        String isiSurat = "";
        char tempatKosong;
        int a = 0; 
        while(a < kata.length()){    
        tempatKosong = kata.charAt(a);
        if(tempatKosong >= 'a' && tempatKosong <= 'z'){
            tempatKosong = (char)(tempatKosong+nilaiPindah);
                if(tempatKosong > 'z'){
                    tempatKosong = (char)(tempatKosong - 'z' + 'a' - 1);
                }
            isiSurat = isiSurat + tempatKosong;
        }else if(tempatKosong >= 'A' && tempatKosong <= 'Z'){
            tempatKosong = (char)(tempatKosong + nilaiPindah);   
            if(tempatKosong > 'Z'){
                tempatKosong = (char)(tempatKosong - 'Z' + 'A' - 1);
            }
            isiSurat = isiSurat + tempatKosong;
        }else{
            isiSurat = isiSurat + tempatKosong;
        }++a;
        }System.out.println(isiSurat);
    }
}
