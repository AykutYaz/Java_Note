package Package03_switchStatemens_stringManipulations;

public class C11_KullanimSayisiBulma {

    public static void main(String[] args) {

        // Kullanicadan bir cumle ve bir harf isteyin
        // verilen cumle ve harfe gore asagidaki cumlelerden
        // uygun olani yazdirin

        // 1- Cumle harfi icermiyor
        // 2- Cumlede harf sadece 1 kere kullanilmis
        // 3- Cumlede harf 1 den fazla kullanilmistir

        String str = "Java ogrendikce guzellesiyor";
        String arananHarf = "a";

        //Once aranan harfin ilk indexinin bulalim
        int ilkIndex = str.indexOf(arananHarf);

        //aranan harfin ikinci indexinin bulalim
        int ikiniciIndex = str.indexOf(arananHarf,ilkIndex+1);

        if (ilkIndex == -1){
            System.out.println("Cumle harfi icermiyor");
        } else if (ikiniciIndex == -1) {
            System.out.println("Cumlede harf sadece 1 kere kullanilmis ");
        }else {
            System.out.println("Cumlede harf 1 den fazla kullanilmistir");
        }


    }
}
