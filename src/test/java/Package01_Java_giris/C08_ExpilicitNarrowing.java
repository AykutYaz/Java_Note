package Package01_Java_giris;

public class C08_ExpilicitNarrowing {

    public static void main(String[] args) {

        int sayi1 = 25;

        byte byt = (byte) sayi1;
        System.out.println(byt); //25

        int sayi2 = 128;
        byt = (byte) sayi2;
        System.out.println(byt); // -128

        // byte -> short -> int -> long -> float -> double
        // Kucukten -> Buyuk degere (OTOMATIK yapar)
        // Buyuk -> Kucukten degere (OTOMATIK yapMAZ!!)
        //byte alabildigi sayi deger araligi -127 ve 127 araligindadir
        //Her zaman dogru sonuc vermez deger buyuk ıse bolumunden kalani da yazabilir

        double dbl = 23.5;
        int sayi6 = (int) dbl;
        System.out.println(sayi6); //23
        //sonuc kisminda ki ondalikli kismi yok sayarak dogru sonucu vermez!!!

        int a = 24;
        int b = 6;

        System.out.println(a/b); // 4

        a = 25;
        b = 8;
        System.out.println(a / b); // int deger olarak vereceginden sadece 3 yazdirir

        double c = a / b;
        System.out.println(c);
        // islem int degerler arasinda yapidigi icin sonuc da
        // int 3 double 3.0 yazdirir ve yine hatali sonuc alinir

        c = (double) a / b ;
        System.out.println(c); // 3.125
        // dogru sonuc atama yapilirsa alinabilmektedir.

    }
}
