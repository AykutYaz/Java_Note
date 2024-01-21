package Package02_MatematikselIslemler_ifElseStatements;

import java.util.Scanner;

public class C05_ifStatements {

    public static void main(String[] args) {

        // Example: Kullancidan bir sayi alin,
        // sayi 3 ile tam bolunuyorsa "Uc ile bolunebilen sayi" ve sayiyi 2 katina cıkartın
        // 5 ile tam bolunuyorsa "Bes ile bolunebilen sayi"

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int sayi = scanner.nextInt();

        if(sayi % 3 == 0){
            System.out.println("Girilen sayi 3 ile tam bolunebilmektedir");
            sayi *= 2;
        }
        if(sayi % 5 == 0){
            System.out.println("Girilen sayi 5 ile tam bolunebilmektedir");
        }
    }
}
