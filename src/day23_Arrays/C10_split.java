package day23_Arrays;

import java.util.Arrays;

public class C10_split {
    public static void main(String[] args) {
        /*
        split() bir array method'u degil, String method'udur
        ama array dondurdugu icin bu konuda anlatiyoruz

        split () ile herhangi bir String'i istedigimiz sekilde parcalara bolup
        bir array haline getiriyoruz
         */

        String str="Java ne kadar guzel";
        String[] kelimeler= str.split(" ");
        System.out.println(Arrays.toString(kelimeler)); // [Java, ne, kadar, guzel]

        String[] kelimelerNe= str.split("ne");
        System.out.println(Arrays.toString(kelimelerNe)); // [Java,  kadar guzel]

        String[] karakterler= str.split("");
        System.out.println(Arrays.toString(karakterler)); // [Java,  kadar guzel]
    }
}
