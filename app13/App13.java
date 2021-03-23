package app13;

import java.util.Scanner;

public class App13{

    public static void main(String[] args) {
    
    Scanner masukkan = new Scanner (System.in);
 
    int tinggi_badan;
   
    System.out.print("Masukkan nama anda = "); 
    String Nama = masukkan.next();
    System.out.print("Jenis Kelamin = "); 
    String jenis_kelamin = masukkan.next();
    System.out.print("Tinggi Badan = "); tinggi_badan = masukkan.nextInt();
    
    if("perempuan".equals(jenis_kelamin)) {
        if( tinggi_badan > 0 && tinggi_badan <=160) 
            System.out.println("Anda Gagal");
        else if(tinggi_badan >= 161 && tinggi_badan <= 210) 
            System.out.println("Anda Lulus");
    }else if ("laki-laki".equals(jenis_kelamin))
        if( tinggi_badan > 0 && tinggi_badan <= 170) {
            System.out.println("Anda Gagal");
        }else if(tinggi_badan > 171 && tinggi_badan <= 230)
            System.out.println("Anda Lulus");
    }
  }

