package Package05_methodOlusturma_whileLoop;

public class C04_MethodOlusturma {

    public static void main(String[] args) {

        // Kullanicidan input olarak verilen bir String,
        // baslangic ve bitis indexleri alip,
        // verilen index'lere gore baslangic index'i dahil, bitis index'i haric
        // olacak sekilde aradaki harfleri yazdiran bir method olusturun.
        //      -kullanici baslangic degeri olarak bitis degerinden buyuk bir sayi girerse,
        //      hata mesaji verin
        //      -Kullanici str'da olan index'lerden daha buyuk bir index girerse
        //      hata mesaji yazdirin

    }
    public static void kendiSubstringimiz (String metin , int basIndex , int bitIndex){

        if (basIndex > bitIndex){
            System.out.println("Baslangic index'i bitis index'inden buyuk olmaz");
        } else if (basIndex> metin.length() || bitIndex > metin.length()) {
            System.out.println("Girilen degerler, girilen metinin uzunlugundan buyuk olamaz");
        }else{

            for (int i = basIndex; i < bitIndex ; i++) {
                System.out.println(metin.charAt(i));
            }

        }
        System.out.println(" ");
    }
}
