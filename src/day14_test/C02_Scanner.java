package day14_test;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {
        /*
         Problem Tanimi
         Kullanicidan a,b ve c sayilarini okuyarak asagidaki islemi yapan kodu yaziniz
         a'nin karesinden b'nin karesini cikarip c'nin 3 katina bolunuz

         Ornek Ekran Ciktisi
         a sayisini giriniz: 5
         b sayisini giriniz: 3
         c sayisini giriniz: 1
         sonuc : 5.333333333333333
         */

        Scanner scan=new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("a sayisini giriniz");
        a= scan.nextDouble();
        System.out.println("b sayisini giriniz");
        b= scan.nextDouble();
        System.out.println("c sayisini giriniz");
        c= scan.nextDouble();
        
        double sonuc= ((a*a)-(b*b))/(3*c);
        System.out.println("sonuc = " + sonuc);
    }
}
