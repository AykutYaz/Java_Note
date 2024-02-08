package Package04_stringManipulations_forLoop;

import java.util.Scanner;

public class C10_Faktoryel {

    public static void main(String[] args) {

        // Example: Kullanicidan 15 den kucuk bir sayi alip,
        //          bu sayinin faktoryel degerini hesaplayin.

        // 6! = 6*5*4*3*2*1

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 15 den kucuk bir sayi giriniz");
        int girilenSayi = scanner.nextInt();

        int faktoryelSayisi = 1;

        for (int i = girilenSayi; i > 1 ; i--) {

            faktoryelSayisi *= i;
        }

        System.out.println(girilenSayi + "! " + faktoryelSayisi);
    }
}
