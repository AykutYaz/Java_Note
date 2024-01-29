package Package03_switchStatemens_stringManipulations;

public class C07_length {

    public static void main(String[] args) {

        String str = "Ahmet Uzunkavaklaraltindayataruyumazoglu";

        //son harfi yazdirin

        System.out.println(str.length()); // 40

        System.out.println(str.charAt(40-1)); // u

        //Dinamik yaparsak girilen harf uzunluguna gore sistem bunu otomatik yapsin

        System.out.println(str.charAt(str.length()-1)); // u

        //sondan 3.karakteri yazdirin

        System.out.println(str.charAt(str.length()-3)); //g
    }
}
