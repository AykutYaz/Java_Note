package Package01_Java_giris;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

        /*
        Kullanicidan ismini, soyismini ve yasini alip
        asagidaki formatta yazdirin.
        Isminiz : John
        Soyisimiz : Doe
        Yasiniz : 44
        Kaydiniz basariyla tamamlanmistir

         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");
        String isim = scanner.nextLine();

        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim = scanner.nextLine();

        System.out.println("Lutfen yasinizi giriniz");
        int yas = scanner.nextInt();

        System.out.println("Isminiz : " + isim);
        System.out.println("Soyisimiz : " + soyisim);
        System.out.println("Yasiniz : " + yas);
        System.out.println("Kaydiniz basariyla tamamlanmistir.");


    }
}
