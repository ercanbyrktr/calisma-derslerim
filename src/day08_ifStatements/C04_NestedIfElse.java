package day08_ifStatements;

import java.util.Scanner;

public class C04_NestedIfElse {
    public static void main(String[] args) {
        /*
        soru12) Kullanicidan 4 basamakli bir sayi girmesini isteyin.
        Girdigi sayi 5'e bölünüyorsa son rakamini kontrol edin.
        Son rakami 0 ise ekrana "5'e bölünen cift sayi" yazdirin.
        Son rakami 0 degil ise "5'e bölünen tek sayi" yazdirin.
        Girdigi sayi 5'e bolunmuyorsa ekrana "Tekrar deneyin" yazdirin.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli bir sayi giriniz");
        int sayi= scan.nextInt();

        // sayinin 5'e bolunup bolunmemesi
        // sayinin son basamaginin sifir olup olmamasi

        if (sayi<1000 || sayi>9999){
            System.out.println("Lutfen 4 basamakli bir sayi girin");
        } else if (sayi%5==0) { // sayi 4 basamakli ve 5'e tam bolunebiliyor
            if (sayi % 10 == 0) {
                System.out.println("5'e bölünen çift sayi");
            } else {
                System.out.println("5'e bölünen tek sayi");
            }
        }else {  // sayi 4 basamakli ama 5'e bolunemiyor
            System.out.println("Tekrar deneyin");
        }

    }
}
