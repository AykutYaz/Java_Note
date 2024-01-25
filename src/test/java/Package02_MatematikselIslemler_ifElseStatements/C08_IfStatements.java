package Package02_MatematikselIslemler_ifElseStatements;

import java.util.Scanner;

public class C08_IfStatements {

    public static void main(String[] args) {

        //Example : Kullanicinin kilo (kg) ve boyunun (cm) isteyip
        // VKE hesaplayin (kilo * 10000 / (boy*boy))
        // Vucut Kitle Endexi ;
        //     30'dan buyukse obez
        // 25-30 arasinda ise kilolu
        // 20-25 arasinda ise normal
        // 15-20 arasinda ise zayif
        // yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen agirliginizi kg cinsinden giriniz : ");
        double kilo = scanner.nextDouble();

        System.out.println("Lutfen boyunuzu cm cinsinden giriniz : ");
        double boy = scanner.nextDouble();

        double vke = kilo * 10000 / (boy*boy);

        if (vke > 100 || vke < 10 ){
            System.out.println("Girdiginiz degerleri kontrol ederek tekrar deneyiniz");
        } else if (vke > 30) {
            System.out.println("Maalesef obezsiniz");
        } else if (vke > 25) {
            System.out.println("Kilolusunuz");
        } else if (vke > 20) {
            System.out.println("Normal kilodasiniz");
        }else if (vke > 15){
            System.out.println("zayifsiniz");
        }

    }
}
