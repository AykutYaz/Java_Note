package Package01_Java_giris;

public class C02_Variables {

    public static void main(String[] args) {

        int sayi;

        //System.out.println(sayi);
        // Atama yapilmadan variable olusturalabilir, fakat kullanilamaz

        sayi= 20;

        System.out.println("sayi sayi sayi");
        // Java " " icinde yazilan metinleri oldugu gibi yazdirir

        System.out.println(sayi);  //20

        sayi = 30;

        System.out.println(sayi);  // 30
        // en son atanan deger ne ise o kullanilir

        boolean emekliOlabilirMi = true;
        // true veya false olarak dönüş olanir

        char ilkHarf = 'a';

        char a = 'g';
        // char data türleri ' ' icerisinde tek karakter tutmaktadir

        System.out.println(ilkHarf); // a
        System.out.println(a); // g

        double dbl =2.3;

        float flt = 5.4f;

        dbl = 20;
        double dbl2 =6;

        // genelde double kullanilir float icin "f" yazmak zorunda olmamak icin


        int not = 56;
        int Not = 34;
        int nOt = 77;

        // atanan isim buyuk kucuk harf duyarliligi vardir
        /*
        isimlendirme yapilirken ilk kelime kucuk harf ile baslayip sonraki kelimeler buyuk harf ile baslamalidir
        Bu kurala CamelCase denilmektedir
        Example: ilkHarf , uzunKavaklarAltındaYatarUyumaz vs,vs

         */
    }
}
