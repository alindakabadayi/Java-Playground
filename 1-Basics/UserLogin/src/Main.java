// Sync testi için eklendi
import java.util.Scanner;

/**
 * Kullanıcı Girişi Programı
 * Kullanıcı adı büyük/küçük harf duyarsız karşılaştırılır.
 * 3 deneme hakkı vardır.
 * @author alindakabadayi
 * @version 0.2
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("\n=== Kullanıcı Girişi Programı ===\n");

        Scanner input = new Scanner(System.in);

        int giris_hakki = 3;


        String sys_kullanici_adi = "Alinda Kabadayı";
        String sys_kullanici_sifre = "1234";

        System.out.println("Kullanıcı Girişine Hoşgeldiniz");
        System.out.println("------------------");

        while (true) {
            System.out.println("Kullanıcı Adı: ");
            String kullanici = input.nextLine();

            System.out.println("Parola: ");
            String parola = input.nextLine();

            if (kullanici.toLowerCase().equals(sys_kullanici_adi.toLowerCase()) && parola.equals(sys_kullanici_sifre)) {

                System.out.println("Sisteme Giriş Başarılı");
                break;

            }
            else if (kullanici.toLowerCase().equals(sys_kullanici_adi.toLowerCase()) && !parola.equals(sys_kullanici_sifre)) {

                System.out.println("Parolanız Yanlış !");

                giris_hakki--;
                System.out.println("Giriş Hakkı: " + giris_hakki);

            }
            else if (!kullanici.toLowerCase().equals(sys_kullanici_adi.toLowerCase())&& parola.equals(sys_kullanici_sifre)) {

                System.out.println("Kullanıcı Adınız Yanlış !");

                giris_hakki--;
                System.out.println("Giriş Hakkı: " + giris_hakki);

            }
            else {
                System.out.println("Kullanıcı Adınız ve Parolanız Yanlış !");

                giris_hakki--;
                System.out.println("Giriş Hakkı: " + giris_hakki);

            }
            if (giris_hakki == 0) {
                System.out.println("Giriş Hakkınız Bitti ! Lütfen Daha Sonra Tekrar Deneyiniz ");
                break;
            }
        }
    }
}
