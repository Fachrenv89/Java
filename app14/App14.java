package app14;
import java.util.Scanner;

public class App14 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        int c = keyboard.nextInt();
        int n;
        int[] Un = new int[c];

        for (int i = 1; i <= c; i++) {
            Un[i - 1] = a + (i - 1) * b;
        }
        for (int j = 0; j < Un.length; j++) {
            if (j % 2 == 1) {
                System.out.print("-" + Un[j] + " ");
            } else {
                System.out.print(Un[j] + " ");
            }
        }
    }
}