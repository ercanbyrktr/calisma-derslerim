package day13_test;

import java.util.Scanner;

public class C11_Modulus {
    public static void main(String[] args) {
        /*
        *Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
        * Ex :
        * input: 12345
        * output:12
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen 5 basamakli bir sayi giriniz :");
        int num= scan.nextInt();

        int ilkIki=num/1000;
        int sonIki=num%100;  // 100 e bolumunden kalanini verir

        int ilkIkiTop=(ilkIki/10) + (ilkIki%10);
        System.out.println("ilkIkiTop = " + ilkIkiTop);
        int sonIkiTop=(sonIki/10) + (sonIki%10);
        System.out.println("sonIkiTop = " + sonIkiTop);
        System.out.println("sayilarin toplami :" + (ilkIkiTop+sonIkiTop));

    }
}
