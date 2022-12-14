package day14_test;

import java.util.Scanner;

public class C03_Scanner {
    public static void main(String[] args) {
        /*
        Problem Tanimi
        Bir iscinin isi bitirme suresini ve toplam isci sayisini alarak, isin bitme suresini
        hesaplayan kodu yaziniz.
        Ornegin, bir isci bir isi 10 gunde yapabilmektedir.
        Buna gore 2 isci ayni isi kac gunde yapar?

        Ornek Ekran Ciktisi
        Bir isci isi kac gunde bitirmektedir? 10
        Toplam kac isci calisacak? 2
        İsin bitme suresi 5 gundur.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("bir isci isi kac gunde bitirmektedir :");
        double birIsciBitirmeSuresi= scan.nextDouble();

        System.out.println("toplam kac isci calisacak :");
        double isci_Sayisi= scan.nextDouble();
        
        double cokluBitirmeSuresi=birIsciBitirmeSuresi/isci_Sayisi;
        System.out.println("cokluBitirmeSuresi = " + cokluBitirmeSuresi);
    }
}
