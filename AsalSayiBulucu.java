package Başlangıç;

import java.util.Scanner;

public class AsalSayiBulucu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Bir sayı girin (Çıkmak için 0 veya negatif bir sayı girin): ");
            int sayi = scanner.nextInt();

            if (sayi <= 0) {
                System.out.println("Program sonlandırılıyor. Güle güle!");
                break;
            }

            if (asalMi(sayi)) {
                System.out.println(sayi + " bir asal sayıdır.");
            } else {
                System.out.println(sayi + " bir asal sayı değildir.");
            }
        }

        scanner.close();
    }

    public static boolean asalMi(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}