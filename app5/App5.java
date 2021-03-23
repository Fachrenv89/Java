package app5;
import java.util.Scanner;

public class App5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("nama = ");
        String nama = input.nextLine();

        System.out.print("jenis kelamin = ");
        String jenis_kelamin = input.nextLine();

        System.out.print("tinggi badan = ");
        int tinggi_badan = input.nextInt();
        
         if (tinggi_badan > 0 && tinggi_badan <=160) {
                System.out.println("Anda Gagal");
            } else if (tinggi_badan > 161 && tinggi_badan <=210) {
                System.out.println("Anda Lulus");
            } else if (tinggi_badan > 0 && tinggi_badan <=170) {
                System.out.println("Anda Gagal");
            } else if (tinggi_badan > 171 && tinggi_badan <=230) {
                System.out.println("Anda ");
        }
    } 
}
