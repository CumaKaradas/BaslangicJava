package Başlangıç;

import java.util.Scanner;

public class KelimeSayaci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Bir cümle girin (Çıkmak için 'q' yazın): ");
            String cumle = scanner.nextLine().trim();

            if (cumle.equalsIgnoreCase("q")) {
                System.out.println("Program sonlandırılıyor. Güle güle!");
                break;
            }

            int basitSayim = basitKelimeSayisi(cumle);
            System.out.println("Basit Sayım Yöntemi: " + basitSayim + " kelime");

            int gelismisYontem = gelismisKelimeSayisi(cumle);
            System.out.println("Gelişmiş Sayım Yöntemi: " + gelismisYontem + " kelime");

            System.out.println();
        }

        scanner.close();
    }

    // Basit kelime sayma yöntemi
    public static int basitKelimeSayisi(String cumle) {
        if (cumle == null || cumle.isEmpty()) {
            return 0;
        }
        String[] kelimeler = cumle.split("\\s+");
        return kelimeler.length;
    }

    // Gelişmiş kelime sayma yöntemi
    public static int gelismisKelimeSayisi(String cumle) {
        if (cumle == null || cumle.isEmpty()) {
            return 0;
        }
        // Noktalama işaretlerini kaldır ve birden fazla boşlukları tek boşluğa indir
        cumle = cumle.replaceAll("[^a-zA-Z0-9\\s]", "").replaceAll("\\s+", " ").trim();
        if (cumle.isEmpty()) {
            return 0;
        }
        return cumle.split("\\s").length;
    }
}