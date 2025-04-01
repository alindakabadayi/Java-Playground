import java.util.Scanner;

/**
 * @author alindakabadayi
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("\n=== ATM PROGRAMI ===\n");
        /*
         * While döngüsü ile ATM programı
         * İşlemler:
         * 1.İşlem : Bakiye Öğrenme
         * 2.İşlem : Para Çekme
         * 3.İşlem : Para Yatırma
         * çıkış : q
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bakiye Giriniz: ");
        int bakiye = scanner.nextInt();
        scanner.nextLine(); // Dummy input

        System.out.println("Bakiyeniz : " + bakiye + " tl.");

        String islemler = """
                1.İşlem : Bakiye Öğrenme
                2.İşlem : Para Çekme
                3.İşlem : Para Yatırma
                Çıkış için q'a basın""";

        System.out.println(islemler);
        System.out.println("*********");

        while (true) {
            String islem = scanner.nextLine();

            if (islem.equalsIgnoreCase("1.İşlem") || islem.equals("1")) {

                System.out.println("Bakiyeniz : " + bakiye + " tl.");
            }
            else if (islem.equalsIgnoreCase("2.İşlem") || islem.equals("2")) {

                System.out.println("Çekmek istediğiniz Tutar: ");
                int tutar = scanner.nextInt();
                scanner.nextLine();

                if (bakiye - tutar < 0) {
                    System.out.println("Bakiyeniz Yeterli Değil! ");
                }
                else {
                    bakiye = bakiye - tutar;
                    System.out.println("Yeni Bakiyeniz : " + bakiye + " tl.");
                }
            }
            else if (islem.equalsIgnoreCase("3.İşlem") || islem.equals("3")) {
                System.out.println("Yatırmak İstediğiniz Tutar: ");

                int tutar = scanner.nextInt();
                scanner.nextLine();

                bakiye = bakiye + tutar;
                System.out.println("Yeni Bakiyeniz : " + bakiye + " tl.");

            }
            else if (islem.equalsIgnoreCase("q")) {
                break;

            }
            else {
                System.out.println("Geçersiz İşlem, Lütfen Tekrar Deneyiniz. ");
            }
        }
    }
}