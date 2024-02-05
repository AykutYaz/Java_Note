package Package04_stringManipulations_forLoop;

public class C05_stringManipulations {

    public static void main(String[] args) {

        //Example: Kullanicinin belirli bir formatta verdigi
        // String fiyatlari toplayip yazdirin.
        // input1 : "15.30$", input2 : "11.40$"
        // output : "26.70$"

        String input1 = "15.30$";
        String input2 = "11.40$";

        String sadeceSayilar1 = input1.replaceAll("\\D","");
        String sadeceSayilar2 = input2.replaceAll("\\D","");

        int sayi1 = Integer.parseInt(sadeceSayilar1);
        int sayi2 = Integer.parseInt(sadeceSayilar2);

        double sonuc = (double) (sayi1 + sayi2) / 100;
        System.out.println(sonuc + " $"); // 26.7 $


    }
}
