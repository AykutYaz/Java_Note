package Package03_switchStatemens_stringManipulations;

public class C12_KullanimSayisiBulma {

    public static void main(String[] args) {

        //Example: Kullanicidan bir string ve aranacak metin alin
        //  Aranan metnin String icerisinde kullanimi kontrol ederek asagidaki cumlelerden uygun
        // -String aranan metini icermiyor
        // -Aranan metin String de sadece 1 kere kullanilmis
        // -Aranan metin String de sadece 1'den fazla kullanilmis

        String str = "Java cok guzel, ben Java calismayi cok seviyorum.";
        String arananMetin = "cok";

        int ilkIndex = str.indexOf(arananMetin);
        int sonIndex = str.lastIndexOf(arananMetin);

        if (sonIndex == -1){
            System.out.println("String aranan metini icermiyor");
        } else if (ilkIndex == sonIndex) {
            System.out.println("Aranan metin String de sadece 1 kere kullanilmis");
        }else {
            System.out.println("Aranan metin String de sadece 1'den fazla kullanilmis");
        }


    }
}
