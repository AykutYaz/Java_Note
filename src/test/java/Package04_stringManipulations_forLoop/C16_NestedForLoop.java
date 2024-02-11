package Package04_stringManipulations_forLoop;

import java.util.Scanner;

public class C16_NestedForLoop {

    public static void main(String[] args) {

        /*
         Kullanicidan * sayisini ve kac saitr olcagini alarak
         Asagidaki sekili gibi cizdirin

         * * * * * * * *
         * * * * * * * *
         * * * * * * * *
         * * * * * * * *
         * * * * * * * *

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen satir sayisini giriniz : ");
        int satirSayisi = scanner.nextInt();

        System.out.println("Lutfen satirlarda bulancak * sayisini = sutun sayisini giriniz");
        int sutunSayisi = scanner.nextInt();

        for (int i = 1; i <=satirSayisi ; i++) {
            for (int j = 1; j <= sutunSayisi ; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }


    }
}
