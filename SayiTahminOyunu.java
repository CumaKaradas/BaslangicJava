package Başlangıç;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int minSayi = 1;
        int maxSayi = 100;
        int hedefSayi = random.nextInt(maxSayi - minSayi + 1) + minSayi;
        int tahmin;
        int denemeSayisi = 0;

        System.out.println("1 ile 100 arasında bir sayı tuttum. Tahmin edebilir misin?");

        do {
            System.out.print("Tahmininizi girin: ");
            tahmin = scanner.nextInt();
            denemeSayisi++;

            if (tahmin < hedefSayi) {
                System.out.println("Daha büyük bir sayı söyleyin.");
            } else if (tahmin > hedefSayi) {
                System.out.println("Daha küçük bir sayı söyleyin.");
            } else {
                System.out.println("Tebrikler! " + denemeSayisi + " denemede doğru tahmin ettiniz.");
            }
        } while (tahmin != hedefSayi);

        scanner.close();
    }
}