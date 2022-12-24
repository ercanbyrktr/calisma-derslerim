package day23_Arrays;

import java.util.Arrays;

public class C08_binarySearch {
    public static void main(String[] args) {
        /*
        Binary search java da eleman aramanin kisa yoludur
        Ancak binary search'un calismasi icin once
        array'in sirali hale getirilmesi gerekir
        Eger siralama yapmadan binarySearch yaparsaniz
        sonucu bulamayabilir veya yanlis bulabilir
         */

        String[] harfler={"Y", "B", "D", "G", "O", "A"};

        String arananHarf="A";

        System.out.println(Arrays.binarySearch(harfler,arananHarf));

        // binarySearch bize aradigimiz elemanin index'ini dondurur
        // array sirali olmadigi icin arama sonucunu dogru bulmayabilir
        // emin olmak icin once sort yapmaliyiz

        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.binarySearch(harfler,arananHarf));
    }
}
