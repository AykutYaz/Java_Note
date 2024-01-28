package Package03_switchStatemens_stringManipulations;

public class C04_equals {

    public static void main(String[] args) {

        String str1 = "Not";
        String str2 = "NOT";
        String str3 = "NOt";
        String str4 = "Not";
        String str5 = new String("Not");
        String s = "N";
        String t ="ot";
        String str6 = s + t ;

        // SIMDILIK : Java da metinsel ifadelerin ayni olup olmadigini kontrol etmek icin
        //           == yerine equals () kullaniriz


        // Buyk Kucuk harf karsilastirmasi sonucu bir yazim problemi yok ise
        // true - false dondurur

        System.out.println(str1.equals(str2)); // Not -- NOT false
        System.out.println(str1.equals(str4)); // Not -- Not true

        //Eger ESITLIGI kontrol ederken case sensitive olmasini istemezseniz
        // equalsIgnoreCase kullanilir (Buyuk kucuk harf onemsiz oldugu halde)

        System.out.println(str1.equalsIgnoreCase(str2)); // Not -- NOT true
        System.out.println(str1.equalsIgnoreCase(str4)); // Not -- NOT true
    }
}
