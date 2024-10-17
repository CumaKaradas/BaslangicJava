package Başlangıç;

import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan boyu ve kiloyu alma
        System.out.print("Lütfen boyunuzu santimetre cinsinden giriniz (örn: 175): ");
        double heightInCm = scanner.nextDouble();

        System.out.print("Lütfen kilonuzu kilogram cinsinden giriniz (örn: 70): ");
        double weight = scanner.nextDouble();

        // Boyu metreye çevirme
        double heightInMeters = heightInCm / 100;

        // BMI hesaplama formülü
        double bmi = weight / (heightInMeters * heightInMeters);

        // BMI sonucunu gösterme
        System.out.printf("Vücut Kitle İndeksiniz: %.2f\n", bmi);

        // Sonuca göre kullanıcıya geri bildirimde bulunma
        if (bmi < 18.5) {
            System.out.println("Zayıf");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Normal kilolu");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Fazla kilolu");
        } else {
            System.out.println("Obez");
        }

        scanner.close();
    }
}
