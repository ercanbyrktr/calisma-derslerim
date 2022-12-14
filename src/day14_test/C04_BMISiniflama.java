package day14_test;

import java.util.Scanner;

public class C04_BMISiniflama {
    public static void main(String[] args) {
        /*
        * Kullanicidan boyu CM ve kilosunu kg alarak BMI(VKE) hesaplayiniz
        *
        * BMI= kilo(kg)/(boy*boy)(cm)
        * BMI<=20 oldukca zayifsiniz
        * 20<BMI<=25 Normal sinirlardasiniz
        * 25<BMI<=30 Sisman kategorisindesiniz
        * 30<BMI ==> Obez grubundasiniz
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("boyunuzu cm olarak giriniz :");
        double boy= scan.nextDouble()/100;  // boyu metreye ilk etapta donusturduk

        System.out.println("kilonuzu kg olarak giriniz :");
        double kilo= scan.nextDouble();

        double BMI=kilo/(boy*boy);

        if (BMI<=20){
            System.out.println("BMI indeksiniz"+BMI+"oldukca zayifsiniz");
        }else if (BMI<=25){
            System.out.println("BMI indexinix"+BMI+"normal sinirlardasiniz");
        } else if (BMI<=30) {
            System.out.println("BMI indexiniz"+BMI+"sisman kategorisindesiniz");
        } else if (BMI>30) {
            System.out.println("BMI indexiniz"+BMI+"obez grubundasiniz");
        }

    }
}
