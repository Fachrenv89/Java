
package app3;
public class App3 { 
    public static void main(String[] args) { 
        // Buat variabel 
        int a = 10; 
        int b = 8; 
        int c = 12; 
        int d = 5; 
        // Bandingkan 
        boolean tes1 = a > b; 
        boolean tes2 = b < c; 
        boolean tes3 = (a * 2) >= (b + c); 
        boolean tes4 = (a / d) <= (c - a); 
        boolean tes5 = (a - d) == d; 
        boolean tes6 = (a - b) != (b - d); 
        boolean tes7 = a > 12; 
        boolean tes8 = b <= 7; 
        boolean tes9 = c == 10; 
        boolean tes10 = d != 5; 
        // Print 
        System.out.println("Tes ke 1 = " + tes1); 
        System.out.println("Tes ke 2 = " + tes2); 
        System.out.println("Tes ke 3 = " + tes3); 
        System.out.println("Tes ke 4 = " + tes4); 
        System.out.println("Tes ke 5 = " + tes5); 
        System.out.println("Tes ke 6 = " + tes6); 
        System.out.println("Tes ke 7 = " + tes7); 
        System.out.println("Tes ke 8 = " + tes8); 
        System.out.println("Tes ke 9 = " + tes9); 
        System.out.println("Tes ke 10 = " + tes10); 
    } 
}