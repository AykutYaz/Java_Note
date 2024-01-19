package Package01_Java_giris;

public class C07_DataCasting {

    public static void main(String[] args) {

        int int1 = 20;
        char chr1 ='y';
        String str1 = "Java";
        short shr1 = 4;
        double dbl1 = 3.5;

        // boolean bl1 = int1 ;
        // boolean bl1 = chr1 ;
        // boolean bl1 = str1 ;

        // int sayi = str1;

        int sayi = chr1;
        sayi = shr1;
        //sayi = dbl1;


        // byte -> short -> int -> long -> float -> double
        // Kucukten -> Buyuk degere (OTOMATIK yapar)
        // atamak istedigimiz vareble daha kucuk kapsaplı bir data turunden buyuge gecerken
        // Java bunu otomatik olarak Casting yapar ve yoluna devam eder

        // Buyuk -> Kucukten degere (OTOMATIK yapMAZ!!)
        int a = 12;
        int c = 567;
        //byte alabildigi sayi deger araligi -127 ve 127 araligindadir
        //Her zaman dogru sonuc vermez deger buyuk ıse bolumunden kalani da yazabilir
        byte b = (byte) a; // 12
        byte d =(byte) c; // Sonuc verir ama bolumnden kalan sonucu verir ve yanliş sonuc olur

        //short shr2 = chr1;
        //short shr2 = int1;
        //short shr2 = dbl1;

        double dbl2 = chr1;
        dbl2 = shr1;
        dbl2 = int1;

    }
}
