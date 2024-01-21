package Package02_MatematikselIslemler_ifElseStatements;

import java.util.Scanner;

public class C06_IfStatements {

    public static void main(String[] args) {


        //Example: Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eşkenar ise "Eskenar ucgen" yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen uchgenin 3 kenar uzunlugunu tam sayi olarak giriniz : " );
        int kenar1 = scanner.nextInt();
        int kenar2 = scanner.nextInt();
        int kenar3 = scanner.nextInt();

        if ( kenar1 == kenar2 && kenar1 == kenar3 && kenar1 > 0 ){
            System.out.println("girilen degerler bir eskenar olusturur");
        }
    }
}
