package Package01_Java_giris;

public class C10_WrapperClasses {
    public static void main(String[] args) {

        int sayi = 10;
        Integer sayiInteger = sayi;

        int sayi2 = sayiInteger;

        // String str = sayi;

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        /*
        Wrapper class'lar primitive data turlerinin hazir methodlar kullanilmesi icin olusturulmustur
        Primitive data turleri ile wrapper classlar arasinda rahatca gecis yapilabir
         */

        String str1 = "25";
        String str2 = "40";

        System.out.println(sayi + sayi2); //2540

        System.out.println(Integer.parseInt(str1) + Integer.parseInt(str2)); // 65

        char chr1 = 'k';

        //Kucuk harf olarak verilen karakteri buyuk harf olaraka yazdirin
        System.out.println(Character.isUpperCase(chr1)); //K

        //verilen karakterin harf olup olmadigini kontrol edin
        System.out.println(Character.isLetter(chr1)); // true

        //verilen karakterin sayi olıp olmadigini kontrol edin
        System.out.println(Character.isDigit(chr1)); // false

    }
}
