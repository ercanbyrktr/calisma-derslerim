package day20_while_doWhileLoop;

import java.util.Scanner;

public class C04_DoWhileLoop {
    public static void main(String[] args) {
        /*
        Kull
        anicidan tam sayilar alin
        kullanici cift sayi girdigi muddetce sayilari yazdirin
        tek sayi girdiginde islemi bitirin
         */

        Scanner scan=new Scanner(System.in);
        int sayi=0;

        // while ile yapalim
        /*
        Loop'lardakullanacagimiz variable'lari loop'tan once olusturmaliyiz
        while loop'da, loop'dan once olusturdugumuz bu variable'a
        atayacagimiz degeri iyi dusunmemiz gerekiyor
         */
        while (sayi%2==0){

            System.out.println("Lutfen bir sayi giriniz");
            sayi=scan.nextInt();
            if (sayi%2==0){
                System.out.println("Girilen sayi cift:" + sayi);
            }

        }

        // de while loop ile yapalim;
        // do while loop'da onceden olusturulan variable'a hangi deger atandiginin
        // hicbir onemi yok, kodumuz her durumda calisir
          /*
          do-while'in dezavantajı:
          ilk calistirma kontrol yapilmadan oldugu icin
          loop'un body'sinde yanlis bir islem yapilmamasina dikkat etmek gerekir
           */
        do {

            System.out.println("Lutfen bir sayi giriniz");
            sayi=scan.nextInt();
            if (sayi%2==0) {
                System.out.println("Girilen sayi cift:" + sayi);
            }else {
                System.out.println("Girilen sayi tek, benden bu kadar");
            }



        }while(sayi%2==0);

    }
}
