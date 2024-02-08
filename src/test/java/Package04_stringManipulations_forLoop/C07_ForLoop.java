package Package04_stringManipulations_forLoop;

public class C07_ForLoop {

    public static void main(String[] args) {


        // 1 den 100 e kadar olan sayilari yanyana yazdirin

        for (int i = 1; i <=100 ; i++) {
            System.out.print(i + " ");
        }

        System.out.println("");

        //100' den geriye dogru iki basamakli sayilari yazdirin

        for (int i = 99; i >=10 ; i--) {
            System.out.println(i + " ");
        }

        System.out.println("");

        // 130 ile 245 arasinmda (sinirlar dahil) 7 ile bolunebilen sayilari yanyana yazdiralim

        for (int i = 130; i <= 245 ; i++) {

            if(i % 7 == 0){
                System.out.print(i + " ");
            }
        }

        // 70 den baslayarak 200 e kadar sınırlar dahil  3'er 3'er arttirarak yazdirin

        for (int i = 70; i <= 200 ; i+=3) {
            System.out.print(i + " ");
        }




    }
}
