package Başlangıç;

import java.util.Scanner;

public class FaktoriyelHesaplama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(
                    "Faktöriyelini hesaplamak istediğiniz sayıyı girin (Çıkmak için 0 veya negatif bir sayı girin): ");
            int sayi = scanner.nextInt();

            if (sayi <= 0) {
                System.out.println("Program sonlandırılıyor. Güle güle!");
                break;
            }

            long iteratifSonuc = iteratifFaktoriyel(sayi);
            System.out.println(sayi + "! (İteratif) = " + iteratifSonuc);

            long recursiveSonuc = recursiveFaktoriyel(sayi);
            System.out.println(sayi + "! (Özyinelemeli) = " + recursiveSonuc);

            System.out.println();
        }

        scanner.close();
    }

    // İteratif (döngü kullanarak) faktöriyel hesaplama
    public static long iteratifFaktoriyel(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long sonuc = 1;
        for (int i = 2; i <= n; i++) {
            sonuc *= i;
        }
        return sonuc;
    }

    // Özyinelemeli (recursive) faktöriyel hesaplama
    public static long recursiveFaktoriyel(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * recursiveFaktoriyel(n - 1);
    }
}