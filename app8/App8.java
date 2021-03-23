package app8;
import java.util.Scanner;
public class App8 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int pilihan, awal, akhir;
    
        System.out.println("PROGRAM MENAMPILKAN DERET BILANGAN HANJIL & GENAP");
        System.out.println("-------------------------------------------------");
        System.out.print("Masukan Pilihan [1. Ganjil] | [2. Genap] : ");
        pilihan=input.nextInt();
        System.out.print("Masukan Nilai Awal : ");
        awal=input.nextInt();
        System.out.print("Masukan Nilai Akhir : ");
        akhir=input.nextInt();
        System.out.println("--------------------------- ");

        switch (pilihan){
            case 1 :  
                    System.out.println("Deret Bilangan Ganjil");
                    for(int i=awal;i<=akhir;i++){
                        if (i%2!=0)
                        System.out.print(i+" ");
                    } 
                    break;
            case 2 :
                    System.out.println("Deret Bilangan Genap");
                    for(int i=awal;i<=akhir;i++){
                        if (i%2==0)
                        System.out.print(i+" ");
                    }
                    break;
        }
        System.out.println("");
    }
}