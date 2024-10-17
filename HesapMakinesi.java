package Başlangıç;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLütfen yapmak istediğiniz işlemi seçin:");
            System.out.println("1. Toplama");
            System.out.println("2. Çıkarma");
            System.out.println("3. Çarpma");
            System.out.println("4. Bölme");
            System.out.println("5. Çıkış");

            System.out.print("Seçiminiz (1/2/3/4/5): ");
            int secim = scanner.nextInt();

            if (secim == 5) {
                System.out.println("Hesap makinesi kapatılıyor. Güle güle!");
                break;
            }

            if (secim < 1 || secim > 4) {
                System.out.println("Geçersiz giriş. Lütfen tekrar deneyin.");
                continue;
            }

            System.out.print("İlk sayıyı girin: ");
            double sayi1 = scanner.nextDouble();
            System.out.print("İkinci sayıyı girin: ");
            double sayi2 = scanner.nextDouble();

            double sonuc = 0;
            switch (secim) {
                case 1:
                    sonuc = topla(sayi1, sayi2);
                    System.out.printf("%.2f + %.2f = %.2f%n", sayi1, sayi2, sonuc);
                    break;
                case 2:
                    sonuc = cikar(sayi1, sayi2);
                    System.out.printf("%.2f - %.2f = %.2f%n", sayi1, sayi2, sonuc);
                    break;
                case 3:
                    sonuc = carp(sayi1, sayi2);
                    System.out.printf("%.2f * %.2f = %.2f%n", sayi1, sayi2, sonuc);
                    break;
                case 4:
                    if (sayi2 != 0) {
                        sonuc = bol(sayi1, sayi2);
                        System.out.printf("%.2f / %.2f = %.2f%n", sayi1, sayi2, sonuc);
                    } else {
                        System.out.println("Hata: Sıfıra bölme hatası!");
                    }
                    break;
            }
        }

        scanner.close();
    }

    public static double topla(double x, double y) {
        return x + y;
    }

    public static double cikar(double x, double y) {
        return x - y;
    }

    public static double carp(double x, double y) {
        return x * y;
    }

    public static double bol(double x, double y) {
        return x / y;
    }
}