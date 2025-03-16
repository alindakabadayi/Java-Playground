import java.util.Scanner;
// Basit Hesap Makinesi
public class BasicCalculator {
    public static void main(String[] args) {

        System.out.println("\n=== Basit Hesap Makinesi ===\n");

        Scanner scanner = new Scanner(System.in);

        String islemler = """
                1. Toplama İşlemi
                2. Çıkarma İşlemi
                3. Çarpma İşlemi
                4. Bölme İşlemi
                Çıkmak İçin Herhangi Bir Tuşa Basınız!""";
        System.out.println(islemler);

        System.out.println("****************************");

        boolean flag = true;
        while (flag) {
            System.out.print("Birinci Sayı: ");
            int sayi1 = scanner.nextInt();
            System.out.print("İkinci Sayı: ");
            int sayi2 = scanner.nextInt();

            scanner.nextLine();  // Dummy input

            System.out.print("İşlemi Seçiniz: ");
            String islem = scanner.nextLine();

            switch (islem) {
                case "1":
                    // Toplama İşlemi
                    System.out.println("Toplama: " + (sayi1 + sayi2));
                    break;
                case "2":
                    // Çıkarma İşlemi
                    System.out.println("Çıkarma: " + (sayi1 - sayi2));
                    break;
                case "3":
                    // Çarpma İşlemi
                    System.out.println("Çarpma: " + (sayi1 * sayi2));
                    break;
                case "4":
                    // Bölme İşlemi
                    System.out.printf("Bölme: %.2f%n", ((double)sayi1 / sayi2));
                    break;
                default:
                    // Kullanıcı "1", "2", "3", "4" değerlerinden başka input girerse yanlış işlem olur.
                    System.out.println("\nYanlış İşlem");
                    System.out.println("Program Sonlandırılıyor!!");
                    flag = false;
            }
            System.out.println("*********");
        }
    }
}
