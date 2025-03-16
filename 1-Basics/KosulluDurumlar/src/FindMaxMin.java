import java.util.Scanner;

/**
 * 3 Sayının En Büyüğünü ve En Küçüğünü Bulma
 * @author alindakabadayi
 */
public class FindMaxMin {
    public static void main(String[] args) {

        System.out.println("\n=== Girilen 3 Sayının En Büyüğünü ve En Küçüğünü Bulma ===");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci Sayı: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci Sayı: ");
        int sayi2 = scanner.nextInt();

        System.out.print("Üçüncü Sayı: ");
        int sayi3 = scanner.nextInt();


        int maksimum, minimum;

        if (sayi1 >= sayi2 && sayi1 >= sayi3) {
            maksimum = sayi1;
        }
        else if (sayi2 >= sayi1 && sayi2 >= sayi3) {
            maksimum = sayi2;
        }
        else {
            maksimum = sayi3;
        }


        if (sayi1 <= sayi2 && sayi1 <= sayi3) {
            minimum = sayi1;
        }
        else if (sayi2 <= sayi1 && sayi2 <= sayi3) {
            minimum = sayi2;
        }
        else {
            minimum = sayi3;
        }

        System.out.println("Maksimum Sayı: " + maksimum);
        System.out.println("Minimum Sayı: " + minimum);
    }
}