package Package04_stringManipulations_forLoop;

public class C17_NestedForLoop {

    public static void main(String[] args) {

        /*

        *                 1.Satir yildiz sayisi 1
        * *               2.Satir yildiz sayisi 2
        * * *             3.Satir yildiz sayisi 3
        * * * *           4.Satir yildiz sayisi 4
        * * * * *         5.Satir yildiz sayisi 5

         */

        int satirSayisi = 5;

        for (int i = 1; i <=satirSayisi ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }
}
