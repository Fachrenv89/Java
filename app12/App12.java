package app12;
import java.util.*;
public class App12 {

    public static void main(String[] args) {
        String libur;
        Scanner scan = new Scanner (System.in);
        
        System.out.println("inputkan angka (1-4):");
        libur = scan.nextLine();
        
        switch (libur){
            case"A":
                System.out.println("4");
                break;
            case"B":
                System.out.println("3");
                break;
            case"C":
                System.out.println("2");
                break;
            case"D":
                System.out.println("1");
                break;
            case"E":
                System.out.println("0");
                break;
            default:
                System.out.println("masuk");
                break;
        }
    }
    
}
