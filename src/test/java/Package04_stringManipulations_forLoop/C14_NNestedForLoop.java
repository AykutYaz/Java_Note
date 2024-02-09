package Package04_stringManipulations_forLoop;

public class C14_NNestedForLoop {

    public static void main(String[] args) {

        // 1'den 4'e kadar olan sayilari yanyana yazdirin

        for (int i = 1; i <4 ; i++) {
            System.out.print( i + " ");
        }

        // alt satira gecin 2 4 6 8 yazdirin
        System.out.println(" ");

        for (int i = 1; i <4 ; i++) {
            System.out.print( 2 * i + " ");
        }

        // alt satira gecin 3 6 9 12 yazdirin
        System.out.println(" ");

        for (int i = 1; i <4 ; i++) {
            System.out.print( 3 * i + " ");
        }

        // alt satira gecin 4 8 12 16  yazdirin
        System.out.println(" ");

        for (int i = 1; i <4 ; i++) {
            System.out.print( 4 * i + " ");
        }

        /*
            Java da diktortgen ve ucgen biciminde sekil olusturmak icin
            nested for loop kullanilir

         */

        System.out.println(" ");

        for (int i = 1; i <=4 ; i++) {  // kac satir oldugunu kontrol eder

            for (int j = 1; j <=4 ; j++) {  // kac satir oldugunu kontrol eder
                System.out.println( i * j + " ");
            }
            System.out.println(" ");
        }
    }
}
