package day20_while_doWhileLoop;

public class C05_DoWhileLoop {
    public static void main(String[] args) {
        /*
        soru 1) 9 dan 190 a kadar 7 nin kati olan tum sayilari ekrana yazdiriniz
         */

        int bas=9;
        int bitis=190;

        int temp=bas;

        // while loop ile

        while (temp<bitis){
            if (temp%7==0){
                System.out.print(temp + " ");
            }
            temp++;
        }

        // do while loop ile yapalim
        temp=bas;
        do {
            if (temp%7==0){
                System.out.print(temp + " ");
            }
            temp++;
        }while (temp<bitis);
    }
}
