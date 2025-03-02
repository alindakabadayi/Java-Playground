import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {

        //BEDEN KİTLE İNDEKSİ HESAPLAMA

         Scanner scanner = new Scanner(System.in);
         System.out.print("Kilonuzu Giriniz: ");
         int kilo = scanner.nextInt();
         System.out.print("Boyunuzu Giriniz:   (Örnek : 1,68): ");
         double boy = scanner.nextDouble();
         double bki = kilo / (boy * boy);

         System.out.print("Beden Kitle Indeksiniz: " + bki);
    }
}
