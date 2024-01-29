package Package03_switchStatemens_stringManipulations;

public class C08_substring {

    public static void main(String[] args) {
        String str = "Java Candir";

        // iki turlu substring alinabilir
        // 1- verilen index ve sonrasi

        System.out.println(str.substring(5));  // Candir
        System.out.println(str.substring(1));  // ava Candir

        //son 4 karakteri yazdiriin
        System.out.println(str.substring(str.length()-4)); //ndir

        //son harfi yazdirin
        System.out.println(str.substring(str.length()-1));

        System.out.println(str.substring(str.length())); // hiclik


        //2-verilen iki index'in arasi

        System.out.println(str.substring(0,4)); // Java
        System.out.println(str.substring(5,8)); // Can

        //str'in ilk harfini kucuk harf olarak yazdirin
        System.out.println(str.substring(0, 1).toLowerCase()); //j

        //Baslangıc ındexi bitis indexinden buyuk olursa
        // System.out.println(str.substring(8,5));       HATA !!

        System.out.println(str.substring(9,9)); // " "


    }
}
