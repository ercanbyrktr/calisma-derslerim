package day24_multiDimensionalArrays;


import java.util.Arrays;

public class C01_Mda {
    public static void main(String[] args) {


    /*
    tek katli arraylerde array'i direk yazdiramiyoruz
    cunku array non-ğrimitive data turdur ve
    her non-primitive data direk yazdirilamayabilir

    ancak array'in icerisindeki elementleri direk yazdirabiliyorduk
    cunku genelde primitve data turu veya String elementler kullaniliyordu

    Multi-dimensional array'lerde en dikkat edecegimiz konu
    ulasmak istedigimiz elementin bir array mi yoksa
    primitive data mi oldugudur
     */

        int[][] sayilar = {{1, 2, 4, 5}, {3, 4}};

    /*
    burada sayilar arrayini dusunursek icinde 2 tane inner array var
    sayilar [0] ==> [1,2,4,5]

    ancak en icerdeki elementlere ulasirsak direk yazdirabiliriz
     */

        System.out.println(sayilar[0]); // [I@511baa65
        System.out.println(Arrays.toString(sayilar[0]));//[1, 2, 4, 5]

        System.out.println(sayilar[0][1]); //2
        System.out.println(sayilar[1][0]); //3

        System.out.println(Arrays.toString(sayilar)); //[[I@511baa65, [I@340f438e]
        System.out.println(Arrays.deepToString(sayilar));// [[1, 2, 4, 5], [3, 4]]

        /*
        array'i iki sekilde declare edebiliyorduk
        1- elemanlari direk yazabiliriz
        int[][] sayilar={{1,2,4,5},{3,4}};

        2- outer ve inner array'lerin uzunluklarini belirterek olusturabiliriz

        int[][] sayilar=new int[3][4];

        ancak 2.yöntemle yaptigimizda inner array'lerin farkli uzunlukta olma ihtimali kalmaz
        bu ornek icin outer array'in 3 tane inner array'i vardir
        her bir inner array'in ise 4 er elemani vardir

        eger inner arrayleri farkli uzunluklarda olusturmak istiyorsaniz
        mecburen 1.yöntemi kullanmalisiniz
         */
    }
}
