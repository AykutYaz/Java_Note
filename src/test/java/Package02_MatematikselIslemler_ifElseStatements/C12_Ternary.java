package Package02_MatematikselIslemler_ifElseStatements;

public class C12_Ternary {

    public static void main(String[] args) {

        int sayi = 10;

        //Eger verilen sayi 2'nin kati ise sayinin 2 katini yazdirin
        //2'nin kati degilse 5 fazlasini yazdirin

        System.out.println( sayi % 2 == 0 ? sayi*2 : sayi+5);

        //verilen sayi pozitif ise 3 ile carpin
        //pozitif degilse 20 ekleyin

        sayi = sayi>0 ? sayi*3 : sayi+20;

        System.out.println(sayi);

        /*
        Ternary sayilar bize sonuc dondurdugu icin ya
        -> direk yazdirmaliyiz
               yada
        -> atama yapmaliyiz

        Sadece ternary'i yazarsak hata verir
        sayi>0 ? sayi*3 : sayi+20;
         */


        // Verielen sayi 5 ile bolunebiliyorsa sayiyi 5 ile carpin
        // 5 ile bolunebiliyorsa "sayi 5'in kati degildir" yazdirin

        if ( sayi % 5 == 0){
            sayi = sayi*5;
        }else {
            System.out.println("Sayi 5'in kati degildir");
        }

        // Bu soruyu Teranry ile yapamayiz

    }
}
