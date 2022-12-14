package day13_test;

import java.util.Scanner;

public class C13_BMI {
    public static void main(String[] args) {
        /*
        Kullanicidan kilosunu ve boyunu alip
        Vücut kitle indeksini hesaplayan bir program yaziniz
        Ipucu: Vucut
        Kitle Indeksi (VKI)= Vucut Agirligi(kg.)/ Boy uzunlugunun karesi (m.)
        ORNEK
        INPUT:  Kilo:71
                Boy: 1,72
        OUTPUT: Vücut Kitle Indeksiniz: 23
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("kg olarak agirliginizi giriniz:");
        double agirlik= scan.nextDouble();

        System.out.println("cm olarak boyunuzu giriniz:");
        double boy= scan.nextDouble();
        boy=boy/100;
        
        double vke=agirlik/(boy*boy);
        System.out.println("vke = " + vke);
    }
}
