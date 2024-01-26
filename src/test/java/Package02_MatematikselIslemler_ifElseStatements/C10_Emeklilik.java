package Package02_MatematikselIslemler_ifElseStatements;

import java.util.Scanner;

public class C10_Emeklilik {
    public static void main(String[] args) {

        //Kullanida cinsiyetini ve yasini alin
        // Kadin, 60 yas ve uzeri, Erkek 65 yas ve uzeri emekli olabilir
        // Cinsiyet ve yasini dikkate alarak "Emekli olabilirsin"
        // veya "Emekli olmak icin .. yil daha calismaniz gerekli" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lutfen yasinizi giriniz : ");
        int yas = scanner.nextInt();

        System.out.println("Lufen cinsiyetinizi giriniz /nE: Erkek K: Kadin");
        char cinsiyet = scanner.next().charAt(0);

        if ( cinsiyet == 'E' || cinsiyet =='e'){
            if (yas< 10 || yas > 85){
                System.out.println("Erkek icin gecersiz yas");
            } else if (yas >= 65) {
                System.out.println("Erkek emekli olabilir");
            }else {
                System.out.println("Erkek emekli olabilmek icin" + (65-yas) + " sene daha gereklidir.");
            }
        } else if (cinsiyet == 'K' || cinsiyet == 'k') {
            if (yas< 10 || yas > 85){
                System.out.println("Kadin icin gecersiz yas");
            } else if (yas >= 60) {
                System.out.println("Kadin emekli olabilir");
            }else {
                System.out.println("Kadin emekli olabilmek icin" + (60-yas) + " sene daha gereklidir.");
            }
        }else {
            System.out.println("Cinsiye icin gecerli bir harf giriniz");
        }


    }
}
