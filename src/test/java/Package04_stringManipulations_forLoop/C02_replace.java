package Package04_stringManipulations_forLoop;

public class C02_replace {

    public static void main(String[] args) {


        String str = "Java candir";

        // Bu metinde ki tum a'lari A yapin
        System.out.println(str.replace('a', 'A'));

        //candir yerine mukemmeldir yazin
        System.out.println(str.replace("candir","mukemmeldir"));

        System.out.println(str); //Java candir
        System.out.println(str.replace('x','y')); // Java candir
        System.out.println(str.replace("a",""));
        System.out.println(str.replaceFirst("a","A")); // JAva candir

    }
}
