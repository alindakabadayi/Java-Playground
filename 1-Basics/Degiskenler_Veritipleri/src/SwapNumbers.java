import java.util.Scanner;

public class SwapNumbers {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci Sayıyı Giriniz: ");
        int num1 = scanner.nextInt();

        System.out.print("İkinci Sayıyı Giriniz: ");
        int num2 = scanner.nextInt();
        System.out.println("Değerler Değiştirilmeden Önce...");

        System.out.println("Birinci Sayı: " + num1 + " İkinci Sayı: " + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Değerler Değiştirildikten Sonra...");

        System.out.println("Birinci Sayı: " + num1 + " İkinci Sayı: " + num2);
    }
}
