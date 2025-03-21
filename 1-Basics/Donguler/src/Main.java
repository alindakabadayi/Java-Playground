/**
 * Döngüler
 * @author alindakabadayi
 * @version 0.1
 */

public class Main {
    public static void main(String[] args) {

        System.out.println("\n=== DÖNGÜLER ===\n");

    // for(Başlatma; Koşul; Arttırma veya Azaltma İşlemleri) {}


        for (int i = 0; i <= 10; i++) {
            System.out.println("i = " + i);
        }


        for (int i = 10; i >= 0; i -= 2) {    // i -= 2 -> i = i - 2
            System.out.println("i = " + i);
        }
        
/*
        int i = 0;
        int j = 0;

        for (; i < 10 && j > 0; i++, j--) {
            System.out.println("i = " + i);
            System.out.println("j = " + j);
        }

    // i < 10 ve j > 0 olduğu zaman ve i'yi 1 arttırmak sürece ve j'yi 1 azaltmak sürece döngü çalışır

  */

    }

}
