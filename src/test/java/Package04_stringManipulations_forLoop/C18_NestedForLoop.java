package Package04_stringManipulations_forLoop;

public class C18_NestedForLoop {

    public static void main(String[] args) {

        /*
         1                 1.Satir 1'den 1'e kadar yazdiralim
         1 2               2.Satir 1'den 2'e kadar yazdiralim
         1 2 3             3.Satir 1'den 3'e kadar yazdiralim
         1 2 3 4           4.Satir 1'den 4'e kadar yazdiralim
         1 2 3 4 5         5.Satir 1'den 5'e kadar yazdiralim
         */

        int satirSayisi = 5;
        for (int i = 1; i <=satirSayisi ; i++) {
            for (int j = 1; j <= i  ; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }
}
