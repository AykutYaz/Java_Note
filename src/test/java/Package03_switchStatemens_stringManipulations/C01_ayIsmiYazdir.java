package Package03_switchStatemens_stringManipulations;

import java.util.Scanner;

public class C01_ayIsmiYazdir {

    public static void main(String[] args) {

        //Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        //NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        // Kullanici o veya O yazdiginda output Ocak olsun

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen yazdirmak istediginiz ay'in ilk harfini giriniz");
        char ilkHarf = scanner.next().toUpperCase().charAt(0);
        //Kullanicinin girdigi metnin ilk harfini buyuk harf olarak kayit ettik

        switch (ilkHarf){

            case 'O' :
                System.out.println("Ocak");
                break;
            case 'S' :
                System.out.println("Subat");
                break;
            case 'M' :
                System.out.println("Mart veya Mayis");
                break;
            case 'N' :
                System.out.println("Nisan");
                break;
            case 'H' :
                System.out.println("Haziran");
                break;
            case 'T' :
                System.out.println("Temmuz");
                break;
            case 'A' :
                System.out.println("Agustos veya Aralik");
                break;
            case 'E' :
                System.out.println("Eylul veya Ekim");
                break;
            case 'K' :
                System.out.println("Kasim");
                break;

        }


    }
}
