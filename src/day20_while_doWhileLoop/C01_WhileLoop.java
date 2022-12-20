package day20_while_doWhileLoop;

public class C01_WhileLoop {
    public static void main(String[] args) {
        /*
        soru 4) kullanicidan baslangic ve bitis harflerini alin
        ve baslangic harfinden baslayip bitis harfinde biten
        tum harfleri buyuk harf olarak ekrana yazdirin.
        Kullanicinin hata yapmadigini farz edin
         */


        char ilkHarh='f';
        char sonHarf='t';

        char temp=ilkHarh;
        String buyult="";

        while(temp<=sonHarf){

            buyult=(temp+"").toUpperCase();

            System.out.print(buyult+" ");
            temp+=1;
        }
    }
}
