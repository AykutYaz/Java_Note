package Package02_MatematikselIslemler_ifElseStatements;

import java.util.Scanner;

public class C07_IfElseStatements {

    public static void main(String[] args) {

        // example: Kullanicidan bir harf isteyin
        // girilen karakter kucuk harf ise onu buyuk harf yazdirin
        // yoksa girilen karakteri yazdirin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz : ");

        char chr = scanner.next().charAt(0);

        if (chr > 'a' && chr < 'z'){
            System.out.println(Character.toUpperCase(chr));
        }else {
            System.out.println(chr);
        }
    }
}
