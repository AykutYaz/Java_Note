package Package01_Java_giris;

import java.util.Scanner;

public class C09_CharDataTuru_Asciitable {

    public static void main(String[] args) {

        char chr1 = 'a';
        char chr2 = 'b';
        System.out.println(chr1); //a

        System.out.println(chr1 + chr2); // 195

        char chr4 = 'f';
        //char olarak verilen kucuk harfi buyuk harfe dondurun (char da upper case yontemi kullanilamiyor)
        System.out.println((char) (chr4 - 32)); // F
        /*
        Hap Bilgi : Tum buyuk kucuk harf arasinda 32 fark vardir
         */

        // her bir harfin Asciitable da ki rakamsal degerine gore islem yapar

        // Kullanicidan bir karakter alin
        // ascii tablosunda girilen karakterden sonraki 3 karakteri yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen asciitablosundan bir karakter giriniz : ");

        char girilenKarakter = scanner.next().charAt(0);

        System.out.println("Girdiginiz karakter : " + girilenKarakter);
        System.out.println("Girdiginiz karakterden bir sonraki : " + (char)(girilenKarakter+1));
        System.out.println("Girdiginiz karakterden iki sonraki : " + (char)(girilenKarakter+2));
        System.out.println("Girdiginiz karakterden uc sonraki : " + (char)(girilenKarakter+3));





    }
}
