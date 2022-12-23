package day22_Arrays;

import java.util.Arrays;

public class C02_Arrays {

    public static void main(String[] args) {

        int sayilar[]=new int[3];

        System.out.println(sayilar);// [I@511baa65
        // non-primitive data turundeki datalari
        // her zaman direk yazdiramayabiliriz
        // Array'i yazdirmak istersek Arrays class'indan yardim isteriz

        System.out.println(Arrays.toString(sayilar)); // [0, 0, 0]

        sayilar [2]=10;
        sayilar [0]=5;
        sayilar [1]=3;
        System.out.println(sayilar);
        System.out.println(Arrays.toString(sayilar)); // [5,3,10]

        String siniflist[]={"Ali","Ayse","Ahmet"};
        System.out.println(Arrays.toString(siniflist)); // [Ali,Ayse,Ahmet]

        siniflist[1]="Hasan";
        System.out.println(Arrays.toString(siniflist)); // [Ali, Hasan, Ahmet]

        System.out.println(siniflist[1]); // Hasan
        System.out.println(siniflist[0]); // Ali
    }
}
