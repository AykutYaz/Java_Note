package Package02_MatematikselIslemler_ifElseStatements;

public class C03_PreIncrement_PostIncrement {

    public static void main(String[] args) {

        int a = 10;
        // a'nin degerini 1 arttirin
        a++;
        int b = a;
        // a ve b'yi yazdirin

        System.out.println("a : " + a + "b : " + b); // a: 11 b:11

        int c =10;

        // C2nin degerinin olustucagimiz d varible a atayin
        int d = c;
        // sonra c yi bir attirin
        c ++;
        System.out.println("c : " + c + "d : " + d); // c:11 d:10

        a = 10;
        b = ++a;  // Once arttir sonra atama yap

        c = 10;
        d = c++;  // Once atama yap sonra arttir


        int sayi = 10;

        System.out.println(sayi--); // 10
        System.out.println(sayi);  //9

        sayi = 20;

        System.out.println(--sayi); // 19
        System.out.println(sayi);  //19

    }
}
