/**
 * Çarpım Tablosu
 * @author alindakabadayi
 * @version 0.1
 */
public class Main {
    public static void main(String[] args) {
        System.out.print("\n=== Çarpım Tablosu ===\n");

        for (int i = 1; i <= 10; i++) {

            System.out.println("-------------------");
            for (int j = 1; j <= 10; j++) {

                System.out.println(i + "*" + j + "=" + i * j);
            }
            System.out.println("-------------------");
        }
    }
}
