package Package03_switchStatemens_stringManipulations;

public class C10_indexOf {

    public static void main(String[] args) {

        String str = "Java cok zevkli, her ders Java gibi olsa";

        System.out.println(str.indexOf("li")); //13

        System.out.println(str.indexOf("er")); // 18
        // ilk buldugu yerdekini getirir sonrasi ile ilgilenmez
        System.out.println(str.indexOf("er",19)); //22

        //str'da ki ilk 3 a harfinin indexlerini yazdirin
        // once ilk a nin indexini bul
        int ilkIndex = str.indexOf('a');
        System.out.println("ilk index: " + ilkIndex);

        //ilk a dan sonraki metine bak ve 2. a nin indexini bul
        int ikinciIndex = str.indexOf('a',ilkIndex+1);
        System.out.println("Ikinci Index : " + ikinciIndex);

        // 2.a dan sonra metine bak ve 3. a nin indexinin bul
        int ucuncuIndex = str.indexOf('a',ikinciIndex+1);
        System.out.println("Ucuncu Index: " + ucuncuIndex);

        System.out.println(str.indexOf("Q")); // -1 bu harfi bulamiyorsa -1 olarak dondurur


        //J'nin ilk 3 indexini yazdirin
        // once ilk J nin indexini bul
        ilkIndex = str.indexOf('J');
        System.out.println("ilk index: " + ilkIndex);                // 0

        //ilk J dan sonraki metine bak ve 2. J nin indexini bul
        ikinciIndex = str.indexOf('J',ilkIndex+1);
        System.out.println("Ikinci Index : " + ikinciIndex);               // 26

        // 2.J dan sonra metine bak ve 3. J nin indexinin bul
        ucuncuIndex = str.indexOf('J',ikinciIndex+1);
        System.out.println("Ucuncu Index: " + ucuncuIndex);               // -1

        // Metinde 2 tane J harfi oldugu icin
        // 2 tanesinin indexini verdi 3.J olamdigi icin -1 olarak gosterdi


    }
}
