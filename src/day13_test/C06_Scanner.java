package day13_test;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        // kullaniciya ad, memleket, su anki konum, yas, boy soran bir program olusturun,
        // ve yasadiklari yeri seviyorlarsa
        // bu bilgiyi yazdirin

        // next() only read the first word
        // nextLine() can read the whole line

        Scanner scan=new Scanner(System.in);
        System.out.println("İsminiz:");
        String isim= scan.nextLine();

        System.out.println("memleketiniz:");
        String memleket= scan.nextLine();

        System.out.println("konumunuz:");
        String konum= scan.nextLine();

        System.out.println("yasiniz:");
        int yas= scan.nextInt();

        System.out.println("boyunuz:");
        double boy= scan.nextDouble();

        System.out.println("yasadiginiz"+konum+"u seviyor musunuz? true/false");
        boolean seviyorMu = scan.nextBoolean();

        System.out.println("isim = " + isim);
        System.out.println("memleket = " + memleket);
        System.out.println("konum = " + konum);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("seviyorMu = " + seviyorMu);


    }
}
