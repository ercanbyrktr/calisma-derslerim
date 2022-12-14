package day13_test;

import java.util.Scanner;

public class C09_IfStatements {
    public static void main(String[] args) {
        /*
        Print "Lutfen is unvaninizi girin
        jobTitle isimli bir degisken olusturun ve kullanicidan isteyin
        Dogru jobtitle yazdirmak icin asagidaki test datalarini kullanin. Exampla:
        Eger jobTitle qa ise print is unvaniniz Quality Analyst
        test data: qa ise print Quality Analyst
        dev ise print Developer
        ba ise print Business Analyst
        pm ise print Project Manager
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen is unvaninizi giriniz");
        String jobTitle=scan.nextLine().toLowerCase();

         if (jobTitle.equals("qa")){
            System.out.println("Quality Analyst");
         } else if (jobTitle.equals("dev")) {
             System.out.println("Developer");
         } else if (jobTitle.equals("ba")) {
             System.out.println("Business Analyst");
         } else if (jobTitle.equals("pm")) {
             System.out.println("Project Manager");
        }else System.out.println("yanlis formatta jobTitle bilgisi girdiniz...");


        switch (jobTitle){
            case "qa":
                System.out.println("Quality Analyst");
                break;
            case "dev":
                System.out.println("Developer");
                break;
            case "ba":
                System.out.println("Business Analyst");
                break;
            case "pm":
                System.out.println("Project Manager");
                break;
            default:
                System.out.println("yanlis formatta jobTitle bilgisi girdiniz...");
                break;

        }

    }
}
