package Package02_MatematikselIslemler_ifElseStatements;

import java.util.Scanner;

public class C09_ıfElseIfStatements {

    public static void main(String[] args) {

        // Kullanicidan aldigi urun adedi ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun
        // Musteri karti varsa 10 urunden fazla alirsa %20 yoksa %15 indirim yapin
        // Musteri karti yoksa 10 urunden fazla alirsa %15 yoksa %10 indirim yapin

        Scanner scanner = new Scanner(System.in);
        System.out.println("Urun adet miktarini giriniz : ");
        int adet = scanner.nextInt();

        System.out.println("Urunun fiyatini giriniz :");
        double urunFiyati = scanner.nextDouble();

        System.out.println("Musteri kartiniz var mi ? /nE : Evet H : Hayir");
        char kartVarMi = scanner.next().charAt(0);

        if (kartVarMi == 'E' && adet > 10){
            System.out.println("Toplamda %20 indirim uygulanmistir " + adet*urunFiyati*80 / 100 + "Tl");
        } else if (kartVarMi == 'E' && adet < 10) {
            System.out.println("Toplamda %15 indirim uygulanmistir " + adet*urunFiyati*85 / 100 + "Tl");
        } else if (kartVarMi == 'H' && adet > 10) {
            System.out.println("Toplamda %15 indirim uygulanmistir " + adet*urunFiyati*85 / 100 + "Tl");
        } else if (kartVarMi == 'H' && adet < 10) {
            System.out.println("Toplamda %10 indirim uygulanmistir " + adet*urunFiyati*90 / 100 + "Tl");
        }else {
            System.out.println("Girilen bilgileri kontrol edip./nTekrardan giris yapiniz");
        }


    }
}
