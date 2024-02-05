package Package04_stringManipulations_forLoop;

public class C03_RegexKullanimi {

    public static void main(String[] args) {

        String str = "J1av4a Guz3el09dir.";

        //Verilen metindeki sayilardan kurtulun

        System.out.println(str.replaceAll("\\d", "")); // Java Guzeldir

        //sayilarin yerine * yazdirin

        System.out.println(str.replaceAll("\\d", "*")); //J*av*a Guz*el**dir.

        //Sayi olamayan tum harfleri cikartin
        System.out.println(str.replaceAll("\\D", "")); // 14309

        str = "j12%a4&6.v    -a2";

        //metindeki harfler disinda kalan herseyi temizleyin
        str = str.replaceAll("\\d", "");
        str = str.replaceAll("\\W","");
        str = str.replaceAll("_","");
        System.out.println(str); // java



    }
}
