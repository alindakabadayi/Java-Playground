import java.util.Scanner;
/**
 * Basit Faiz Hesaplama Uygulaması
 * Bu program, kullanıcıdan anapara (başlangıç parası) ve yatırım süresi (yıl olarak) alır.
 * Her yıl sonunda oluşan toplam para miktarını ekrana yazdırır.
 * Faiz oranı sabittir(%6) ve her yıl anaparaya faiz eklenerek hesap yapılır.
 * @author alindakabadayi
 * @version 0.1
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("\n=== Faiz Uygulaması ===\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bankamıza Hoşgeldiniz: " + "\nFaiz Oranı %6'dır.\n");
        System.out.println("---------------------");

        int anapara, vade;

        System.out.println("Yatırmak İstediğiniz Ana Para: ");
        anapara = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Paranızı Kaç Yıl Vadeli Yatırmak İstiyorsunuz: ");
        vade = scanner.nextInt();
        scanner.nextLine();

        double toplampara = anapara;
        double faizOran = 0.06;

        for (int i = 1; i <= vade; i++) {

            toplampara = (toplampara * faizOran) + toplampara;

            System.out.printf("%d. Yılın Sonunda Toplam Paranız: %.2f Tl.%n", i, toplampara);
        }
    }
}
