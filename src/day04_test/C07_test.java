package day04_test;

import java.util.Scanner;

public class C07_test {
    public static void main(String[] args) {
        // bir onceki soruyu tek seferde kullanicidan tum bilgilericalarak yapiniz

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi,soyisminizi ve yasinizi giriniz \naralarda Enter tusuna basiniz");

        String isim= scan.nextLine();
        String soyisim= scan.nextLine();
        int yas= scan.nextInt();

        //girilen bilgiler = seyfi capar 34 seklinde yazdirin
        System.out.println("girilen bilgiler = "+isim+", "+soyisim+", "+yas);
    }
}
