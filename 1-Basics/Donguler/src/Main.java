import java.util.Scanner;

/**
 * Döngüler
 *
 * @author alindakabadayi
 * @version 0.2
 */

public class Main {
    public static void main(String[] args) {

        System.out.println("\n=== DÖNGÜLER ===\n");

        // for(Başlatma; Koşul; Arttırma veya Azaltma İşlemleri) {}

/*
        for (int i = 0; i <= 10; i++) {
            System.out.println("i = " + i);
        }


        for (int i = 10; i >= 0; i -= 2) {    // i -= 2 -> i = i - 2
            System.out.println("i = " + i);
        }


        int i = 0;
        int j = 0;

        for (; i < 10 && j > 0; i++, j--) {
            System.out.println("i = " + i);
            System.out.println("j = " + j);
        }

    // i < 10 ve j > 0 olduğu zaman ve i'yi 1 arttırmak sürece ve j'yi 1 azaltmak sürece döngü çalışır



    // === for döngüsü kullanarak faktoriyel bulma ===

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int fact = 1;
        int sayi = scanner.nextInt();

        for (int i = 2; i <= sayi; i++) {
            fact *= i;
            System.out.println("Factorial " + i + ": " + fact);
        }


        // === While Döngülerini Kullanma ve for Döngülerinden Farkı ===

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz: ");

        int sayi = scanner.nextInt();
        System.out.print("Factorial " + sayi + "!: ");

        int fact = 1;

        while (sayi > 1) {
            fact *= sayi;
            sayi--;
        }
        System.out.println(fact);



    // === Sonsuz Döngü Olayı ===

        int i = 0;

        while (i < 10) {
            System.out.println("i = " + i);
        }



    // === do/while Döngüsü ===

    /*

        do {
            // Koşul doğru olduğu sürece
            // while'dan farkı; do bloğu koşulu konrol etmeden kesin olarak en az 1 kere çalışmasının garanti olması

            }while (koşul);

    */


/*
    // Sayıların Rakamlarının Toplamı

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen Bir Sayı Giriniz: ");

        int num = scanner.nextInt();

        int sum = 0;

        // İlk olarak birler basamağı, toplam değişkenine eklenir.

        do {
            sum += num %10;

            num /= 10;  // Sayı güncellendi
            System.out.println("Sayı: " + num);
        }
        while (num > 0);

        System.out.println("Rakamları Toplamı: " + sum);

*/


    // break -> Karşılaşıldığı yerde döngü sonlanır.
    // continue -> Karşılaşıldığı yerde döngü başa döner.


        Scanner scanner = new Scanner(System.in);
        int islem;

        while (true) {
            System.out.print("Bir Sayı Giriniz: ");
            islem = scanner.nextInt();

            if (islem <= 0) {
                System.out.println("Döngüden çıkılıyor..");
                break;
            }

            System.out.println("Girdiğiniz Sayı: " + islem);
        }
    }
}