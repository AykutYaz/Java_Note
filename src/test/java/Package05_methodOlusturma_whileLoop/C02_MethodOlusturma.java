package Package05_methodOlusturma_whileLoop;

public class C02_MethodOlusturma {

    public static void main(String[] args) {

        // Verilen isim ve soyisim'i buyuk, diger harflar kucuk olacak sekilde
        // duzenleyin ve yazdiran bir method olusturun

        isimDuzenleYazdir("AYKUT" , "MART"); //Aykut Mart
        isimDuzenleYazdir("eyup" , "eker");  //Eyup Eker

    } // main sonu


    public static void isimDuzenleYazdir(String isim , String soyisim){
        // input : isim : AYKUT  soyisim : MART

        String duzenleIsim = isim.substring(0,1).toUpperCase() +
                             isim.substring(1).toLowerCase()+ " " +
                            soyisim.substring(0,1).toUpperCase() +
                            soyisim.substring(1).toLowerCase() ;

        System.out.println(duzenleIsim);

        // method yazildi fakat bu hali ile calisan method dis dunyaya aktarilamaz
        // main methodun icinden cagirilmasi gerekli


    }





} // class sonu
