package Package02_MatematikselIslemler_ifElseStatements;

import java.util.Scanner;

public class C02_RakamlarToplamiBulma {

    public static void main(String[] args) {

        //Kullanicdan 4 basamaklı pozitif bir tamsayi alip
        //Rakamlar toplamini yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen 4 basamakli pozitif bir tam sayi giriniz : " );
        int sayi = scanner.nextInt(); //2415

        int birlerBasamagi = 0;
        int rakamlarToplami= 0;

        birlerBasamagi = sayi % 10; //5
        rakamlarToplami = rakamlarToplami + birlerBasamagi; //0+5 ==> 5
        sayi = sayi / 10; // 2415/10 = 241 (int oldugu ıcın tam sayi aliriz)

        birlerBasamagi = sayi % 10; // 241%10 = 1
        rakamlarToplami = rakamlarToplami + birlerBasamagi; // 5+1 ==> 6
        sayi = sayi / 10; // 241/10 = 24 (int oldugu ıcın tam sayi aliriz)

        birlerBasamagi = sayi % 10; // 24 % 10 = 4
        rakamlarToplami = rakamlarToplami + birlerBasamagi; // 6 +4 ==> 10
        sayi = sayi / 10; // 24 / 10 = 2 (int oldugu ıcın tam sayi aliriz)

        birlerBasamagi = sayi % 10; // 2 % 10 = 2
        rakamlarToplami = rakamlarToplami + birlerBasamagi; // 2+10 ==> 12
        sayi = sayi / 10; // 2 / 10 = 0 (int oldugu ıcın 0 aliriz)

        System.out.println("Verilen sayilarin rakamlar toplami : " + rakamlarToplami);
    }
}
