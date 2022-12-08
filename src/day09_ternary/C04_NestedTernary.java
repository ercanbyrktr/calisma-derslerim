package day09_ternary;

import java.util.Scanner;

public class C04_NestedTernary {
    public static void main(String[] args) {

        // soru2 : Kullanicidan bir harf isteyin
        // kucuk harf ise consola "Kucuk harf" ,
        // buyuk harf ise consola "Buyuk harf"
        // yoksa "girdiginiz karakter harf degil" yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char harf=scan.next().charAt(0);

        /*
        String sonuc= (jarf>='a' && harf<='z') ? ("Kucuk Harf") :
             ("Buyuk harf veya gecersiz karakter");
         */

        String sonuc= (harf>='a' && harf <='z') ? ("Kucuk Harf") :
                ((harf>='A' && harf<='Z') ? "Buyuk Harf" : "Gecersiz karakter") ;
        System.out.println(sonuc);

    }
}
