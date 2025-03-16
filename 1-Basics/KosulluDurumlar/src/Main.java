// If/Else Blokları

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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


    }
}
// else blokları tek başına yazılamaz. if değişkenine bağlı olarak kullanılırlar.
// else if blokları, if bloğu çalışmazsa kontrol edilir.