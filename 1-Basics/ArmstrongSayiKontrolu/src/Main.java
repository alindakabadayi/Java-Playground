import java.util.Scanner;

/**
 * Armstrong Sayı Kontrolü
 * Armstrong sayısı, bir sayının her basamağının, basamak sayısı kadar kuvveti alınıp toplandığında bu toplam, sayının kendisine eşit olan sayılardır.
 * @author alindakabadayi
 * @version 0.1
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("\n=== Armstrong Checker ===\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen Sayıyı Giriniz: ");

        int sayi = scanner.nextInt();
        int basamakSayisi = String.valueOf(sayi).length();  //  Basamak sayısını hesaplama
        System.out.println("Sayının Basamak Sayısı: " + basamakSayisi);

        int gecicisayi = sayi;
        int toplam = 0;

        // Do/while döngüsü ile basamakları işleme

        do {
            int basamak = sayi % 10; // Son basamağı bulma
            gecicisayi /= 10;
            toplam += Math.pow(basamak, basamakSayisi); // Basamağın, basamak sayısı kadar kuvvetini alır.
        }

        while (gecicisayi > 0);

        if (toplam == sayi) {
            System.out.println(sayi + ", " + "bir Armstrong sayısıdır.");
        }
        else {
            System.out.println(sayi + ", " + "bir Armstrong sayısı değildir.");
        }
    }
}
