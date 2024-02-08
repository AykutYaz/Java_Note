package Package04_stringManipulations_forLoop;

import java.util.Scanner;

public class C09_ForLoop {

    public static void main(String[] args) {

        // Example: Kullanicidan baslangic ve bitis degerleri olarak pozitif sayilar alin,
        //          sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        //          Bitis degeri baslangic degerinden kucukse, "Uyari" yazdirin ve islemi sonlandirin

        System.out.println("Lutfen baslangic ve bitis sayilarini giriniz : ");

        Scanner scanner = new Scanner(System.in);
        int baslangic = scanner.nextInt();
        int bitis = scanner.nextInt();
        int toplam = 0;


        if (bitis < baslangic){
            System.out.println("Bitis degeri Baslangic degerinde kucuk olamaz , \nTekrar deneyin");
        }else {
            for (int i = baslangic; i <=bitis ; i++) {
                toplam += i;
            }
            System.out.println("Baslangic sayisi :" + baslangic +
                    " ile " + bitis + " sayisi arasindaki rakamlarin toplami : " + toplam);

        }


    }
}
