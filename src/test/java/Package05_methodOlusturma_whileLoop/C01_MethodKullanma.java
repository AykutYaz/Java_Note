package Package05_methodOlusturma_whileLoop;

public class C01_MethodKullanma {
    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.toUpperCase());  // JAVA CANDIR

        System.out.println("Java'da cok kolaylik var");

        str.substring(3); // a Candir

        System.out.println(str.substring(3));
        // method calisir, istedigimiz islemin sonucunu bize dondurur
        // biz de yazdirdigimiz icin bu sonucu goruruz
        // ama sonucu kaydetmedigimiz icin bu method'un calismasi ve bize getirdigi sonuc
        // sadece 14.satirla sinirli olur

        String istenenParca = str.substring(5);
        // method calisti istenen parcayi bize dondurur
        // biz o metini kaydetmis oluruz
        // biz su an icin kayit edilen parcayi goremeyiz
        // kayit ettigimiz icin istersek yazdirir istersek de ileride kullaniriz

        System.out.println(istenenParca); //Candir


    }
}
