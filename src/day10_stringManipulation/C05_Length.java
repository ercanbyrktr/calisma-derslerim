package day10_stringManipulation;

public class C05_Length {
    public static void main(String[] args) {
        String str="Java ogren, isi kap";

        System.out.println(str.length());  // str'im karakter sayisini dondurur  19

        System.out.println(str.charAt(str.length()-1));  // son karakterini yazdiralim

        System.out.println(str.charAt(str.length()-3));  // sondan 3. karekteri yazdiralim

        /*
        Java'da null pointer (isaretleyici) bir deger degil,
        karsisina yazildigi variable'in hicbir deger almadiginin isaretcisidir
         */

        String str2=""; // str2'ye bir deger atanmis midir EVET
                        // bu deger nedir : hiclik
        System.out.println(str2.length());  // 0

        String str3=null;  // str3'e bir deger atanmıs mıdır HAYIR
                           // null bu deger atamamayı isaret etmektedir
        System.out.println(str3.length());  // bir deger atanmamis ki nasil uzunlugu olsun
                                            // NullPointerException olarak hata verir
    }
}
