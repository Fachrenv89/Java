package app11;

import java.util.Scanner;

public class App11 {
    public static void main(String[] args) {
        // Buat Scanner
        Scanner inp = new Scanner(System.in);

        // Ambil Nama
        System.out.print("Masukkan nama anda = ");
        String Nama = inp.next();

        // Ambil NIM
        System.out.print("Masukkan NIM = ");
        String nim = inp.nextLine();

        // Ambil Nilai
        System.out.print("Masukkan Nilai = ");
        int nilai = inp.nextInt();

        // Print
        if(nilai > 55) {
            System.out.println("Anda lulus");
        } else {
            System.out.println("Anda Tidak lulus");
        }
    }
}
