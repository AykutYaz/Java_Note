package Package01_Java_giris;

import java.util.Scanner;

public class C04_Scanner {

    public static void main(String[] args) {

        //Kullanicidan ismini alin

        //Buyuk harflerle yazdiriralim

        //1-Scanner objesi olustur

        Scanner scanner = new Scanner(System.in);

        //2-Kullaniciya ne istedigimizi yazdir

        System.out.println("Lutfen isminizi giriniz : ");

        //3- girilen degeri kayit edebilicegimiz bir vareble olusturup
        // scanner objesi ile uygun method kullanip degeri alalim

        String kullaniciIsmi = scanner.nextLine();

        System.out.println(kullaniciIsmi.toUpperCase());
        // ali can
        // ALI CAN
    }
}
