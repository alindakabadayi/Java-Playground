// If/Else Blokları

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*

        System.out.println("\n=== If/Else Blokları ===");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen yaşınızı giriniz: ");

        int yas = scanner.nextInt();

        if(18 <= yas && yas < 65) {
            System.out.println("Araç kullanabilirsiniz!");
        }

        else if(65 <= yas) {
            System.out.println("Gözetim Dahilinde Araç Kullanabilirsiniz!");
        }

        else {
            System.out.println("Araç Kullanamazsınız!");
        }

        // else blokları tek başına yazılamaz. if değişkenine bağlı olarak kullanılırlar.
        // else if blokları, if bloğu çalışmazsa kontrol edilir.

        */

        System.out.println("\n=== Switch/Case Yapıları ===");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen yaşınızı giriniz: ");

        int yas = scanner.nextInt();

        // Switch/Case yapısında doğrudan aralık kontrolü yapılamadığı için yaşı kategorilere ayırırız.

        int kategori = 0;

        if (yas >= 18 && yas < 65) {
            kategori = 1;
        }
        else if (65 <= yas) {
            kategori = 2;
        }

        // Yaş kategorisine göre switch/case yapısı:
        switch (kategori) {
            case 1:
                System.out.println("Araç kullanabilirsiniz!");
            break;
            case 2:
                System.out.println("Gözetim Dahilinde Araç Kullanabilirsiniz!");
            break;
            default:
                System.out.println("Araç Kullanamazsınız!");
            break;
        }
        /*
        Break kullanılmazsa, eşleşen case'den sonraki tüm case'ler de çalışır.(fall-through)
        Default case, hiçbir koşul sağlanmadığında çalışır.
        Switch/case yapısı, çok sayıda if-else if bloğu yerine kullanılabilir.
        Yaş aralıkları gibi karmaşık koşullar için genellikle if/else daha uygundur.
        Switch/case yapısı, aralık durumları yerine eşitlik durumlarında daha sık kullanılır.
        */

    }
}