package day06_concatenation;

import java.util.Scanner;

public class C01_WrapperCalsses {
    public static <scanner> void main(String[] args) {

        /*
        Wrapper class javanin hazir methodlari kullanabilmemiz icin
        primitive data turlerinin herbiri icin actigi class'lardir
         */

        String str= "Java ile hayat ne guzel";

        System.out.println(str.toUpperCase()); // JAVA İLE HAYAT NE GUZEL

        boolean guzelMi=true;
        // guzelMi. boolean primitive oldugundan hazir method'u bulunmuyor

        Boolean buGuzelMi=true;
        buGuzelMi.toString();

        System.out.println(Short.MIN_VALUE);  // -32768
        System.out.println(Short.MAX_VALUE);  // 32767

        String ogrno="123456";

        // kullanicidan bir sifre isteyin
        // eger sifre sadece rakamlardan olusuyorsa kabul etmeyelim

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli bir sifre giriniz");


        String sifre = scan.nextLine();
        Integer sifreSayi= Integer.parseInt(sifre);

        System.out.println("girilen sifre :" + sifre);
        System.out.println("Integer sifre :" + sifreSayi);

        /*
        Wrapper class'lar ilerde kullanabilecegimiz pekcok faydali hazir method icerir
         */



    }
}
