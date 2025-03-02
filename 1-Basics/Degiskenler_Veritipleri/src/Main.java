import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       System.out.println("=== TEMEL MATEMATİKSEL İŞLEMLER ===");
        int a = 15;
        int b = 4;

        System.out.println("Toplama: " + a + " + " + b + " = " + (a + b));
        System.out.println("Çıkarma: " + a + " - " + b + " = " + (a - b));
        System.out.println("Çarpma: " + a + " * " + b + " = " + (a * b));
        System.out.println("Bölme: " + a + " / " + b + " = " + ((double)a / b));
        System.out.println("Mod Alma: " + a + " % " + b + " = " + (a % b));

        // ARTTIRMA VE AZALTMA OPERATÖRLERİ

        System.out.println("\n=== ARTTIRMA VE AZALTMA ÖRNEKLERİ ===");
        int sayi = 5;
        System.out.println("Sayı: " + sayi);
        System.out.println("Önceden Arttırma (++sayi): " + (++sayi));  // Önce arttırır, sonra kullanır
        System.out.println("Sonradan Arttırma (sayi++): " + (sayi++)); // Önce kullanır, sonra arttırır
        System.out.println("Son değer: " + sayi);

        // KARMAŞIK SAYISAL ÖRNEKLER

        System.out.println("\n=== KARMAŞIK SAYISAL ÖRNEKLER ===");

        // Daire Hesaplamaları

        double yaricap = 5.0;
        final double PI = Math.PI;
        double alan = PI * yaricap * yaricap;
        double cevre = 2 * PI * yaricap;

        System.out.printf("Daire Alanı (r=%.2f): %.2f%n", yaricap, alan);
        System.out.printf("Daire Çevresi (r=%.2f): %.2f%n", yaricap, cevre);

        // Üçgen Alanı (Heron Formülü)

        double kenar1 = 3;
        double kenar2 = 4;
        double kenar3 = 5;
        double s = (kenar1 + kenar2 + kenar3) / 2;
        double ucgenAlani = Math.sqrt(s * (s - kenar1) * (s - kenar2) * (s - kenar3));
        System.out.printf("Üçgen Alanı: %.2f%n", ucgenAlani);

        // MATH SINIFI KULLANIMI

        System.out.println("\n=== MATH SINIFI ÖRNEKLERİ ===");
        double sayi1 = 16.0;
        double sayi2 = 3.7;

        System.out.println("Karekök: Math.sqrt(" + sayi1 + ") = " + Math.sqrt(sayi1));
        System.out.println("Üs Alma: Math.pow(" + sayi1 + ", 2) = " + Math.pow(sayi1, 2));
        System.out.println("Yukarı Yuvarlama: Math.ceil(" + sayi2 + ") = " + Math.ceil(sayi2));
        System.out.println("Aşağı Yuvarlama: Math.floor(" + sayi2 + ") = " + Math.floor(sayi2));
        System.out.println("En Yakına Yuvarlama: Math.round(" + sayi2 + ") = " + Math.round(sayi2));

        // SICAKLIK DÖNÜŞÜMÜ

        System.out.println("\n=== SICAKLIK DÖNÜŞÜMÜ ===");
        double celsius = 25.0;
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.printf("%.1f°C = %.1f°F%n", celsius, fahrenheit);

        // FAİZ HESAPLAMA

        System.out.println("\n=== FAİZ HESAPLAMA ===");
        double anaPara = 1000.0;
        double faizOrani = 0.05; // %5
        int yil = 3;
        double toplamPara = anaPara * Math.pow(1 + faizOrani, yil);
        System.out.printf("Ana Para: %.2f TL%n", anaPara);
        System.out.printf("%d Yıl Sonra Toplam Para: %.2f TL%n", yil, toplamPara);

        // YAŞ HESAPLAMA

        System.out.println("/n=== YAŞ HESAPLAMA ===");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen yaşınızı giriniz: ");
        int yas = scanner.nextInt();
        System.out.println("Yaşınız: " + yas);
    }
}