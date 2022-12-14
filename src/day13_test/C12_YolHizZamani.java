package day13_test;

import java.util.Scanner;

public class C12_YolHizZamani {
    public static void main(String[] args) {
        /*
        Problem Tanimi
        Mesafeyi ve hizi alip süreyi hesaplayan bir kod yaziniz.
        Örnegin: İstanbul ile Ankara arasi 400 km olarak olculmektedir. Bu yolu ortalama
        120 km/saat hizla giden bir arac ne kadar sürede hedefe varir?

        Örnek ekran ciktisi
        Mesafeyi giriniz: 400
        Hizi giriniz: 100
        süre 4 saattir
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("gideceginiz yol mesafesi(km)");
        double yol= scan.nextDouble();

        System.out.println("ortalama hiziniz(km/sa) :");
        double ort_hiz= scan.nextDouble();

        double varis_suresi=yol/ort_hiz;
        System.out.println("varis sureniz :" +varis_suresi);
    }
}
