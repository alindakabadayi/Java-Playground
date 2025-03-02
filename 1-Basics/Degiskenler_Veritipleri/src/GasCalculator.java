import java.util.Scanner;

public class GasCalculator {
    public static void main (String[] args) {

        //KİLOMETREYE GÖRE TOPLAM ÖDENECEK TUTAR HESAPLAMA

         Scanner scanner = new Scanner(System.in);
         System.out.print("Aracınız Kilometrede Kaç Kuruş Yakıyor?  (Örnek : 0,75): ");
         double kurus = scanner.nextDouble();
         System.out.print("Aracınız Kaç Kilometre Gitti? :");
         int km = scanner.nextInt();
         System.out.print("Toplam Ödemeniz Gereken Tutar: " + (kurus * km) + " TL'dir. ");
    }
}
