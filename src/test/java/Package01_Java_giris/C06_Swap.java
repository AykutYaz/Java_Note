package Package01_Java_giris;

import java.util.Scanner;

public class C06_Swap {

    public static void main(String[] args) {

        /*
        Kullanicidan iki sayi alip , ikisinin yerlerini degistiriniz

         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen iki sayi giriniz");
        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();

        System.out.println("Girdiginiz ilk sayi " + sayi1 + "Girdiginiz ikinci sayi " + sayi2);

        int geciciSayiTemp ;

        geciciSayiTemp = sayi1;

        sayi1 = sayi2;

        sayi2 = geciciSayiTemp;

    }
}
